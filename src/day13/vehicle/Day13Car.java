package day13.vehicle;

public class Day13Car extends Day13Vehicle {

    private int fuel;

    public Day13Car(int speed, String name) {
        super(speed, name);
    }

    public void refuel(int amount) {
        fuel += amount;
        System.out.println("자동차가 연료룰 충전합니다, 남은 연료: " + fuel + "L");
    }
}
