package day16;

import day16.game.*;

public class Day16Practice {
    public static void main(String[] args) {

        Day16Attackable warrior = new Day16Warrior();
        Day16Mage mage = new Day16Mage();
        Day16Healable priest = new Day16Priest();

        warrior.attack();
        mage.attack();
        mage.heal();
        priest.heal();
    }
}
