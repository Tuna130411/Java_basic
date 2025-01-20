package day5;

public class Day5Repeat {
    public static void main(String[] args) {

        int i;
        for (i = 5; i > 0; i--) {
            System.out.println("i = " + i);
        }

        int count = 6;
        while (count <= 5) {
            System.out.println("count = " + count++);
        }

        int countt = 5;
        while (countt >= 1) {
            System.out.println("countt = " + countt--);
        }

        int number = 6;
        do {
            System.out.println("number = " + number++);
        } while (number <= 5);
    }
}
