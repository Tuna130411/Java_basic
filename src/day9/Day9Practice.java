package day9;

public class Day9Practice {

    public static void main(String[] args) {

        Gun gun1 = new Gun();
        gun1.name = "K1A";
        gun1.type = "기관단총";
        gun1.range = 200;
        gun1.weight = 2.88;
        gun1.info();

        Gun gun2 = new Gun();
        gun2.name = "K2";
        gun2.type = "돌격소총";
        gun2.range = 600;
        gun2.weight = 3.37;
        gun2.info();

        Gun gun3 = new Gun();
        gun3.name = "K5";
        gun3.type = "권총";
        gun3.range = 50;
        gun3.weight = 0.734;
        gun3.info();

        Gun gun4 = new Gun();
        gun4.name = "K14";
        gun4.type = "저격소총";
        gun4.range = 800;
        gun4.weight = 6;
        gun4.info();

    }
}
