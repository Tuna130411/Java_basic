package day14;

import day14.electronic_device.Day14ElectronicDevice;
import day14.electronic_device.Day14Laptop;
import day14.electronic_device.Day14Smartphone;
import day14.electronic_device.Day14TV;

public class Day14Practice {
    public static void main(String[] args) {

        Day14Smartphone smartphone = new Day14Smartphone("스마트폰");
        Day14Laptop laptop = new Day14Laptop("노트북");
        Day14TV tv = new Day14TV("TV");

        Day14ElectronicDevice[] electronicDevices = new Day14ElectronicDevice[3];

        electronicDevices[0] = smartphone;
        electronicDevices[1] = laptop;
        electronicDevices[2] = tv;

        for (Day14ElectronicDevice electronicDevice : electronicDevices) {
            electronicDevice.turnOn();
        }

        for (Day14ElectronicDevice electronicDevice : electronicDevices) {
            electronicDevice.turnOff();
        }


    }
}
