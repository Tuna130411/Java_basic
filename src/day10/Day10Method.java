package day10;

public class Day10Method {

    public static void main(String[] args) {

        int result = add(1, 2);
        System.out.println("result = " + result);

        System.out.println(hello("홍길동"));


        Day10Cat cat1 = new Day10Cat();
        Day10Cat cat2 = new Day10Cat("성현");
        cat2.introduce();
        Day10Cat cat3 = new Day10Cat(13);
        cat3.introduce();
        Day10Cat cat4 = new Day10Cat("성현",13);
        cat4.introduce();
    }

    public static int add(int a, int b) {
        System.out.println(a + b);
        return  a + b;
    }
    public static String hello(String name) {
        return "안녕 " + name + "아";
    }
}
