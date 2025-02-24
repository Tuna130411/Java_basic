package day13.vehicle;

public class Day13Vehicle {

    protected int speed;
    protected String name;

    public Day13Vehicle(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public void move() {
        System.out.println(name + "(이)가 움직입니다. 속도: " + speed + "km/h");
    }
}
