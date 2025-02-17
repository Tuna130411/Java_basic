package day9;

public class Day9Practice {

    public static void main(String[] args) {

        Day9Gun day9Gun1 = new Day9Gun();
        day9Gun1.name = "K1A";
        day9Gun1.type = "기관단총";
        day9Gun1.range = 200;
        day9Gun1.weight = 2.88;
        day9Gun1.info();

        Day9Gun day9Gun2 = new Day9Gun();
        day9Gun2.name = "K2";
        day9Gun2.type = "돌격소총";
        day9Gun2.range = 600;
        day9Gun2.weight = 3.37;
        day9Gun2.info();

        Day9Gun day9Gun3 = new Day9Gun();
        day9Gun3.name = "K5";
        day9Gun3.type = "권총";
        day9Gun3.range = 50;
        day9Gun3.weight = 0.734;
        day9Gun3.info();

        Day9Gun day9Gun4 = new Day9Gun();
        day9Gun4.name = "K14";
        day9Gun4.type = "저격소총";
        day9Gun4.range = 800;
        day9Gun4.weight = 6;
        day9Gun4.info();

    }
}
