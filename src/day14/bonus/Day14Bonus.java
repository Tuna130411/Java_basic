package day14.bonus;

import java.util.Scanner;

public class Day14Bonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("높이를 입력하세요: ");
        int l = sc.nextInt();

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= l - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < l; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = l * 2 - (i * 2 + 1) ; j > 0; j--) {
                System.out.print("*");
            }
            if (i < l - 1) {
                System.out.println();
            }

        }

    }
}
