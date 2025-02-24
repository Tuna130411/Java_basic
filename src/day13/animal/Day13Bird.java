package day13.animal;

public class Day13Bird extends Day13Animal {

    private int wingSize;

    public Day13Bird(String name, String color, String gender, int wingSize) {
        super(name, color, gender);
        this.wingSize = wingSize;
    }

   public void fly() {
       System.out.println("제 이름은 " + getName() + "이고 색은 " + getColor() + "이고 성별은 " + getGender() + "이며 제 날개 크기는" + wingSize + "입니다.");
   }

    public void fly2() {
        System.out.println("제 이름은 " + super.name + "이고 색은 " + super.color + "이고 성별은 " + super.gender + "이며 제 날개 크기는" + wingSize + "입니다.");
    }


}
