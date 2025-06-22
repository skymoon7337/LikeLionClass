package makes.m3_daycalculator;

import java.util.Scanner;

public class DayCalculator_V1 {
    public static void main(String[] args) {

    // 무한 루프때 계속 생성됨으로, while문 밖으로 뺌
    Scanner scanner = new Scanner(System.in);

    //반복 실행 되게 while 사용
    while (true) {


        int inputyear;
        int inputmonth;
        int inputday;

        while (true) {
            System.out.println("연도를 입력하세요(YYYY): ");
            inputyear = scanner.nextInt();
            if (inputyear >= 1583) break;
            System.out.println("1583년 이후만 계산 가능합니다.");
        }

        while (true) {
            System.out.println("월을 입력하세요(MM): ");
            inputmonth = scanner.nextInt();
            if (inputmonth >= 1 && inputmonth <= 12) break;
            System.out.println("1월부터 12월까지만 입력 가능합니다");
        }

        while (true) {
            System.out.println("일을 입력하세요(DD): ");
            inputday = scanner.nextInt();
            if (inputday >= 1 && inputday <= 31) break;
            System.out.println("1일부터 31일까지만 입력 가능합니다");
        }

        // Zeller 보정으로 인해 변경될 수 있는 요일들의 원본 저장
        int year = inputyear;
        int month = inputmonth;
        int day = inputday;


        // Zeller 공식의 1월,2월 보정
        // 2월은 윤년 등등 때문에 예외발생
        // 3~12월의 반복으로 패턴화, 즉 당해 1월을 전년도 13월, 2월을 14월 이라고 침
        if (inputmonth == 1 || inputmonth == 2) {
            inputmonth += 12;
            inputyear--;
        }

        // Zeller 공식 계산식
        int k;
        int j;
        int resultday;

        k = inputyear % 100;
        j = inputyear / 100;

        resultday = (inputday + (13 * (inputmonth + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        ;

        // resultday -> 0(토요일), 1(일요일), 2(월요일), 3(화요일), 4(수요일), 5(목요일), 6(금요일)
        String[] days = {"토", "일", "월", "화", "수", "목", "금"};

        System.out.printf("%d년 %d월 %d일은 %s요일 입니다.\n", year, month, day, days[resultday]);

        System.out.println("");
        System.out.println("반복 실행합니다.");
        System.out.println("종료하려면 exit을 입력해주세요.");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("exit")){   //대소문자 구분 X
            break;
        }
    }

    scanner.close();

    }
}

//2,4,6,9,11월의 날짜 입력 제한 필요(ex: 4월 31일 불가)
//캘린더와 연결해 해당 날짜 띄워서 맞는지 확인 해보면 좋을듯