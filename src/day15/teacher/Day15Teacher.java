package day15.teacher;

public abstract class Day15Teacher{

    protected String name;

    public Day15Teacher(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("제 이름은 " + name + "입니다.");
    }

    public abstract void teachSubject();

}
