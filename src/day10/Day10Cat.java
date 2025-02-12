package day10;

public class Day10Cat {

    private String name;
    private int age;
    private String gender;

    public Day10Cat() {
    }

    public Day10Cat(String name) {
        this.name = name;
    }

    public Day10Cat(int age) {
        this.age = age;
    }

    public Day10Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("내 이름은 " + name + "이고 나이는 " + age + "살이야.");
    }

    public String getName() {
        return name;
    }

    public int gatAge() {
        return age;
    }
}
