package day7;

import java.util.Scanner;

public class Day7Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] chars = new char[4];

        chars[0] = 'c';
        chars[1] = 'h';
        chars[2] = 'a';
        chars[3] = 'r';

        int[] ints1 = {85, 90, 78, 92, 88};

        for (int i = 0; i<chars.length; i++) {
            System.out.println("chars = " + chars[i]);
        }
        for (int i = 0; i<=4; i++) {
            System.out.println("ints1 = " + ints1[i]);
        }

        System.out.println(chars.length);

        System.out.print("배열의 크기를 입력하세요: ");
        int len = sc.nextInt();
        int[] ints = new int[len];

        for (int i = 0; i<ints.length; i++) {
            System.out.print("값을 입력하세요: ");
            ints[i] = sc.nextInt();
        }

        for (int i = 0; i<ints.length; i++) {
            System.out.println("ints = " + ints[i]);
        }
    }
}
