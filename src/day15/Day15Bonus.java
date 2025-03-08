package day15;

import java.util.Scanner;

public class Day15Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        int a, b;
        int result = 0;

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b =sc.nextInt();
            result += a * b;
        }
        if (x == result) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
