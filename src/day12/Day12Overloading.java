package day12;

public class Day12Overloading {
    public static void main(String[] args) {

        Day12Calculator calc = new Day12Calculator();

        System.out.println("두 정수의 합: " + calc.add(3, 5));
        System.out.println("세 정수의 합: " + calc.add(3, 5, 7));
        System.out.println("두 실수의 합: " + calc.add(3.5, 5.2));
    }
}
