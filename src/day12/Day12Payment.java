package day12;

public class Day12Payment {

    public int calculate(int a, int b) {
        return a + b;
    }

    public int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public double calculate(double a, double b) {
        return Math.round(a + b) * 1000 / 1000.0;
    }

    public int calculate(int a) {
        return 1500 * a;
    }
}
