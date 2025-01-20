package day4;

import java.util.Scanner;

public class Day4Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        System.out.print("세 번째 숫자를 입력하세요: ");
        int num3 = sc.nextInt();

        int maxNum = (num1 > num2) ? num1 : num2;
        maxNum = (maxNum > num3) ? maxNum : num3;

        System.out.println("세 수 중 가장 큰 값은: " + maxNum);

        System.out.print("월을 입력하세요 (1~12): ");
        int season = sc.nextInt();
        if (season >= 3 && season <= 5) {
            season = 0;
        } else if (season >= 6 && season <= 8) {
            season = 1;
        } else if (season >= 9 && season <= 11) {
            season = 2;
        } else if (season == 12 || (season >= 1 && season <= 2)) {
            season = 3;
        } else {
            System.out.println("잘못된 입력입니다");
        }

        int weather = (season % 12) / 3;
        System.out.println("weather = " + weather);

        switch (weather) {
            case 0 :
                System.out.println("입력하신 월에 해당하는 계절은: 겨울");
                break;
            case 1:
                System.out.println("입력하신 월에 해당하는 계절은: 봄");
                break;
            case 2:
                System.out.println("입력하신 월에 해당하는 계절은: 여름");
                break;
            case 3:
                System.out.println("입력하신 월에 해당하는 계절은: 가을");
                break;
            default:
                System.out.println("잘못된 입력입니다");
        }

//        System.out.print("첫 번째 숫자를 입력하세요: ");
//        double num1 = sc.nextDouble();
//        System.out.print("연산자를 입력하세요 (+, -, *, /, %): ");
//        char op = sc.next().charAt(0);
//        System.out.print("두 번째 숫자를 입력하세요: ");
//        double num2 = sc.nextDouble();
//
//        switch (op) {
//            case '+':
//                System.out.println(num1 + num2);
//                break;
//            case '-':
//                System.out.println(num1 - num2);
//                break;
//            case '*':
//                System.out.println(num1 * num2);
//                break;
//            case '/':
//                System.out.println(num1 / num2);
//                break;
//            case '%':
//                System.out.println(num1 % num2);
//                break;
//            default:
//                System.out.println("잘못된 입력입니다.");
//
//        }
    }
}
