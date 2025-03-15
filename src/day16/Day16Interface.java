package day16;

import day16.animal.*;

public class Day16Interface {
    public static void main(String[] args) {

        Day16Flyable bird = new Day16Bird();
        Day16Swimmable fish = new Day16Fish();
        Day16Duck duck = new Day16Duck();

        bird.fly();
        fish.swim();
        duck.fly();
        duck.swim();
    }
}
