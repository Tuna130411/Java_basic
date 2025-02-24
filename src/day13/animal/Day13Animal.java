package day13.animal;

public class Day13Animal {
    protected String name;
    protected String color;
    protected String gender;

    public Day13Animal(String name, String color, String gender) {
        this.name = name;
        this.color = color;
        this.gender = gender;
    }

    public void makeSound() {
        System.out.println(name + "이 소리를 냅니다.");
    }

    public void introduce(int age) {
        System.out.println("제 이름은 " + name + "이고 색은 " + color + "이고 성별은 " + gender + "이며 " + age + "살 입니다");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    }
}
