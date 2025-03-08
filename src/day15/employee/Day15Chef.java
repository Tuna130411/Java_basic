package day15.employee;

public class Day15Chef extends Day15Employee{

    public Day15Chef(String name) {
        super(name, "요리사");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + "이(가) 요리를 합니다.");
    }
}


