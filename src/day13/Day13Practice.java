package day13;

import day13.vehicle.Day13Bicycle;
import day13.vehicle.Day13Car;
import day13.vehicle.Day13Vehicle;

public class Day13Practice {
    public static void main(String[] args) {

        Day13Vehicle truck = new Day13Vehicle(50,"트럭");
        truck.move();

        Day13Car car = new Day13Car(80,"자동차");
        car.move();
        car.refuel(10);

        Day13Bicycle bicycle = new Day13Bicycle(20,"자전거");
        bicycle.move();
        bicycle.pedal();

    }
}
