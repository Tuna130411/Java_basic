package day13.bonus;

import java.util.*;

public class Day13Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i <= 2; i++) {
            intList.add(sc.nextInt());
        }
        for (Integer i : intList) {
            System.out.println("i = " + i);

        }

        Map<String, Integer> abc = new HashMap<>();

        abc.put("a", 331);
        System.out.println(abc.get("a"));

        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(2);
        s.add(2);
        s.add(2);
        s.add(2);

        for (Integer i : s) {
            System.out.println("i = " + i);
        }

        s.remove(1);

        for (Integer i : s) {
            System.out.println("i = " + i);
        }
    }
}
