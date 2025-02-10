package day9;


import java.util.Stack;

public class Day9Class {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.age = 3;
        dog1.name = "김율";

        System.out.println(dog1.name);
        System.out.println("dog1.age = " + dog1.age);
        dog1.bark();
        dog1.introduce();

        Dog dog2 = new Dog();
        dog2.age = 5;
        dog2.name = "뽀삐";

        System.out.println(dog2.name);
        System.out.println("dog2.age = " + dog2.age);
        dog1.bark();
        dog1.introduce();
    }
}
