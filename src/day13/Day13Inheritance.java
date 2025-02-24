package day13;

import day13.animal.Day13Animal;
import day13.animal.Day13Bird;

public class Day13Inheritance {
    public static void main(String[] args) {

        Day13Animal animal1 = new Day13Animal("일반 동물", "빨간색","수컷");
        animal1.makeSound();
        animal1.introduce(1);

        Day13Bird bird1 = new Day13Bird("새","주황색","암컷",15);
        bird1.fly();
        bird1.makeSound();

    }
}
