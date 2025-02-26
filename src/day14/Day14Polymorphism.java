package day14;

import day14.animal.Day14Lion;
import day14.animal.Day14Penguin;

public class Day14Polymorphism {
    public static void main(String[] args) {

        Day14Lion lion = new Day14Lion("사자");
        lion.makeSound();

        Day14Penguin penguin = new Day14Penguin("펭귄");
        penguin.makeSound();
    }
}
