package day16.animal;

public class Day16Duck implements Day16Flyable, Day16Swimmable{
    @Override
    public void fly() {
        System.out.println("오리가 하늘을 납니다.");
    }

    @Override
    public void swim() {
        System.out.println("오리가 물속을 헤엄칩니다.");
    }
}
