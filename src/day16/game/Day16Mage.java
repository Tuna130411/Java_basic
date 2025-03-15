package day16.game;

public class Day16Mage implements Day16Attackable, Day16Healable {
    @Override
    public void attack() {
        System.out.println("마법사가 공격을 합니다.");
    }

    @Override
    public void heal() {
        System.out.println("마법사가 회복을 합니다.");
    }
}
