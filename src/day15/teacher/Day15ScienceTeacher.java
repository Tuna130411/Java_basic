package day15.teacher;

public class Day15ScienceTeacher extends Day15Teacher{

    public Day15ScienceTeacher(String name) {
        super(name);
    }

    @Override
    public void teachSubject() {
        System.out.println("저는 과학를 가르칩니다.");
    }
}
