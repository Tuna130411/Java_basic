package day11;

import day9.Day9Dog;

public class Day11Encapsulation {
    public static void main(String[] args) {

        Day11Field example = new Day11Field();

        System.out.println(example.publicField);

        System.out.println(example.getPrivateField());

        example.setPrivateField("새로운 값");
        System.out.println(example.getPrivateField());
    }

}
