package day3;

import java.util.Scanner;

public class Day3Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int n1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int n2 = sc.nextInt();
        System.out.print("세 번째 숫자를 입력하세요: ");
        int n3 = sc.nextInt();
        System.out.println("average = " + ((n1 + n2 + n3) / 3.0));

        double average = (double) (n1 + n2 + n3) / 3;
        System.out.println("average = " + average);


    }
}
