const display = document.getElementById('display');

let first = '';
let second = '';
let operator = null;
let resultDisplayed = false;

document.querySelectorAll('.digit').forEach(
    btn => {
        btn.addEventListener('click', () => {
            if (resultDisplayed) {
                first = '';
                resultDisplayed = false;
            }

            const digit = btn.dataset.digit;

            if (!operator) {
                if (!(digit === '.' && first.includes('.'))) first += digit;
                display.textContent = first || '0';
            } else {
                if (!(digit === '.' && second.includes('.'))) second += digit;
                display.textContent = second || '0';
            }
        });
    }
)

document.querySelectorAll('.function').forEach(
    btn => {
        btn.addEventListener('click', () => {
            const action = btn.dataset.action;

            if (action === 'clear') {
                first = '';
                second = '';
                operator = null;
                display.textContent = '0';
                return;
            }

            if (action === 'equals') return;

            operator = action;
            resultDisplayed = false;
        })
    }
)

document.querySelector('[data-action="equals"]').addEventListener(
    'click',
    () => {
        const params = new URLSearchParams({
            num1: first,
            num2: second,
            operator
        });
        fetch('/calculate', {
            method: 'POST',
            headers: { 'Content-Type': 'application/x-www-form-urlencoded'},
            body: params
        }).then(res => res.json())
        .then(data => {
            display.textContent = data.result;
            first = data.result.toString();
            second = '';
            operator = null;
            resultDisplayed = true;
        })
        .catch(error => {
            console.error(error);
            display.textContent = 'Error';
        })
    }
);