package day2;

import java.util.Scanner;

public class Day2Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("출생 연도를 입력하세요: ");
        int i = sc.nextInt();
        System.out.println("당신의 나이는 " + (2025 - i) + "살 입니다");

        System.out.print("사각형의 가로 길이를 입력하세요: ");
        double sq1 = sc.nextDouble();
        System.out.print("사각형의 세로 길이를 입력하세요: ");
        double sq2 = sc.nextDouble();
        System.out.println("사각형의 넓이는 " + (sq1 * sq2) + " 입니다.");

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int n1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int n2 = sc.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        System.out.println(n1 + " % " + n2 + " = " + (n1%n2));

        System.out.println("자기소개를 시작합니다! 정보를 입력해주세요.");
        System.out.print("이름을 입력해주세요: ");
        String name = sc.next();
        System.out.print("나이를 입력해주세요: ");
        int age = sc.nextInt();
        System.out.print("성별을 입력해주세요: ");
        String gender = sc.next();
        System.out.println("자기 소개를 시작합니다.");
        System.out.println("제 이름은 " + name + "이고 " + age + "살 " + gender + "입니다!");
    }
}
