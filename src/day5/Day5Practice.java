package day5;

import java.util.Scanner;

public class Day5Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1번 문제
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        // 2번 문제
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("i = " + i);
        }

        // 3번 문제
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }

        // 4번 문제
        while (true) {
            System.out.print("줄력할 단을 입력하세요 (2~9): ");
            int i = sc.nextInt();
            if (i < 10 && i > 1) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " x " + j + " = " + (j * i));
                }
                break;
            } else {
                System.out.println("2에서 9 사이의 수를 입력해주세요.");
            }
        }
    }
}
