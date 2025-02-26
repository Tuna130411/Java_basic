package day14.animal;

public class Day14Penguin extends Day14Animal {

    public Day14Penguin(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(getName() + "가 물속을 헤엄칩니다!");
    }

    @Override
    public void makeSound() {
        System.out.println("꽥꽥?");
    }
}
