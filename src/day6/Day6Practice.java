package day6;

import java.util.Scanner;

public class Day6Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1번 문제

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println("i = " + i);
        }

         //2번 문제

        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();

        int a = 0;

        for (int i = 1; i <= n; i++) {
            a += i;
            if (a >= 50) {
                System.out.println("합계가 50을 넘었습니다. 반복 종료!");
                break;
            }
            System.out.println("현재 합계: " + a);
        }
        System.out.println("최종 합계: " + a);

        // 3번 문제

        System.out.print("삼각형의 높이를 입력하세요: ");
        int l = sc.nextInt();

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= l - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
