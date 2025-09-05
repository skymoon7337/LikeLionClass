package codingTest.likeLion;

import java.util.Scanner;

public class hard3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("변의 길이를 입력하세요: ");
        int n = sc.nextInt();

        char[][] arr = new char[n][n];
        int ascii = 0;

        for (int sum = 0; sum <= 2 * (n - 1); sum++) {
            for (int i = 0; i <= sum; i++) {
                int j = sum - i;
                if (i < n && j < n) {
                    arr[i][j] = (char) (ascii + 65);
                    ascii++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// n=1: 1
// n=2: 1 / 2 / 1
// n=3: 1 / 2 / 3 / 2 / 1
// n=4: 1 / 2 / 3 / 4 / 3 / 2 / 1

// 변의 길이(n)에 따른 대각선 -> // 2(n-1)+1 개
// 대각선 인덱스: 2(n-1)+1-1  == 2(n-1)
// 0 <= 대각선 인덱스 범위 <=2(n-1)

//배열의 순서 (ex: n=3)
//대-인 0: (0,0)
//대-인 1: (1,0), (0,1)
//대-인 2: (2,0), (1,1), (0,2)
//대-인 3: (2,1), (1,2)
//대-인 4: (2,2)

//계산 순서와 관계있는 대각선 인덱스의 값이 요소의 합과 같음
// [i,j] /  sum=i+j ->  i=sum,  j=sum-i  으로 표현 가능
// 0<= i < n /  0<= j < n
// 대각선 인덱스와 같은 sum은 n보다 클 수 있다. (2n-2는 n보다 클 수 있음)

// 1: sum(대각선 인덱스)를 증가시키고 범위 지정.
// 2: 그 안에서 i값 증가시키고 범위 지정. (j는 i와 sum 으로 표현)
// 3: A인 아스키코드 65번부터 시작시킴. (첫값은 0)

// 배열 인덱스 범위 초과 오류가 발생한다.
// 그런데 값들이 점차 증가하다보면 값들의 범위에서 문제가 생긴다.

// 0<=i<=2(n-1) 인 i가 < n 이여야 하는데, 2(n-1)>n 인 경우가 생겨버린다.
// 정리하면 n>2 인 경우, 범위 오류 발생.

// 0<=j<=2(n-1)-i 인 j가 < n 이여야 하는데, 2(n-1)-i)>n 인 경우가 생겨버린다.
// 정리하면 n>2+i 일때, 범위 오류 발생.

// 요약하면 j의 최대값이 n 이상이 되는 문제가 생긴다.
// (배열은 n*n인데 n을 초과하는 인덱스 발생)

// 따라서 i와 j의 값을 n미만 으로 설정해줘야 한다.