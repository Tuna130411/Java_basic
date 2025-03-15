package day16;

import java.util.Scanner;

public class Day16Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ints = new int[9];
        int maxNum = 0;
        int count = 0;

        for (int i = 0; i < ints.length; i++) {
            ints[i] = sc.nextInt();
            if (maxNum < ints[i]) {
                maxNum = ints[i];
                count = i + 1;
            }
        }
        System.out.println(maxNum);
        System.out.print(count);
    }
}
