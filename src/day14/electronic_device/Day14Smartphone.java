package day14.electronic_device;

public class Day14Smartphone extends Day14ElectronicDevice {

    public Day14Smartphone(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(getName() + "이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println(getName() + "이 꺼졌습니다.");

    }
}
