package day15.teacher;

public class Day15MathTeacher extends Day15Teacher{

    public Day15MathTeacher(String name) {
        super(name);
    }

    @Override
    public void teachSubject() {
        System.out.println("저는 수학을 가르칩니다.");
    }
}
