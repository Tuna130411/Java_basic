package day15.employee;

public class Day15Doctor extends Day15Employee{

    public Day15Doctor(String name) {
        super(name, "의사");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + "이(가) 환자를 진료합니다.");
    }
}
