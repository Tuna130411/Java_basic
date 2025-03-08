package day15.teacher;

public class Day15EnglishTeacher extends Day15Teacher{

    public Day15EnglishTeacher(String name) {
        super(name);
    }

    @Override
    public void teachSubject() {
        System.out.println("저는 영어를 가르칩니다.");
    }
}
