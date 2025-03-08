package day15.employee;

public class Day15Developer extends Day15Employee{

    public Day15Developer(String name) {
        super(name, "개발자");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + "이(가) 코드를 작성합니다.");
    }
}
