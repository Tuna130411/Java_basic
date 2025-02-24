package day13.vehicle;

public class Day13Bicycle extends Day13Vehicle {

    public Day13Bicycle(int speed, String name) {
        super(speed, name);
    }

    public void pedal() {
        System.out.println("자전거를 페달로 밉니다!");
    }
}

