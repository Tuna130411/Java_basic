package day12;

import java.util.Scanner;

public class Day12Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Day12Payment payment = new Day12Payment();
        Day12ShapeCalculator shca = new Day12ShapeCalculator();

        System.out.println("두 상품 총액: " + payment.calculate(10000, 15000) + "원");
        System.out.println("세 상품 총액: " + payment.calculate(10000,12000,23000) + "원");
        System.out.println("두 상품 총액(실수): " + payment.calculate(15, 5.99) + "원");
        System.out.print("연필(1500원) 몇 개를 구매할까요? ");
        int pencil = sc.nextInt();
        System.out.println("연필 총액: " + payment.calculate(pencil) + "원 입니다");

        System.out.println("정사각형의 면적: " + shca.calculate(8));
        System.out.println("직사각형의 면적: " + shca.calculate(4,5));
        System.out.println("원의 면적: " + shca.calculate(3.0));

        Day12Book[] books = new Day12Book[3];
        books[0] = new Day12Book("해리포터", "조엔 롤링", false);
        books[1] = new Day12Book("반지의 제왕", "J.R.R. 톨킨", false);
        books[2] = new Day12Book("어벤져스", "스탠 리, 잭 커비", false);

        System.out.print("빌릴 책 번호를 입력하세요: ");
        int bookNumber = sc.nextInt();
        if (bookNumber > books.length || bookNumber < 1) {
            System.out.println("그런 책은 없습니다.");
            return;
        }

        books[bookNumber - 1].rentBook();

        for (Day12Book book : books) {
            book.introduce();
        }
    }
}
