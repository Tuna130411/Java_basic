package day9;


public class Day9Class {

    public static void main(String[] args) {

        Day9Dog day9Dog1 = new Day9Dog();
        day9Dog1.age = 3;
        day9Dog1.name = "김율";

        System.out.println(day9Dog1.name);
        System.out.println("dog1.age = " + day9Dog1.age);
        day9Dog1.bark();
        day9Dog1.introduce();

        Day9Dog day9Dog2 = new Day9Dog();
        day9Dog2.age = 5;
        day9Dog2.name = "뽀삐";

        System.out.println(day9Dog2.name);
        System.out.println("dog2.age = " + day9Dog2.age);
        day9Dog1.bark();
        day9Dog1.introduce();
    }
}
