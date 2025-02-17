package day10;

public class Day10Student {

    private int age;
    private String name;

    public Day10Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void introduce() {
        System.out.println("안녕하세요. 저는 " + age + "살 " + name + "입니다.");
    }

}
