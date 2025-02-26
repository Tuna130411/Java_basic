package day14.animal;

public class Day14Lion extends Day14Animal {

    public Day14Lion(String name) {
        super(name);
    }

    public void roar() {
        System.out.println(getName() + "가 크게 으르렁거립니다!");
    }

    @Override
    public void makeSound() {
        System.out.println("으르렁!!");
    }
}
