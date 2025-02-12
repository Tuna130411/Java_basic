package day10;

import java.util.Scanner;

public class Day10Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Day10Student student1 = new Day10Student(25, "승환");
        Day10Student student2 = new Day10Student(18, "민수");
        Day10Student student3 = new Day10Student(15, "영희");

        Day10Student[] students = new Day10Student[3];

        for (int i = 1; i<=3; i++) {
            System.out.print("학생 " + i + "의 이름을 입력하세요: ");
            String name = sc.next();

            System.out.print("학생 " + i + "의 나이를 입력하세요: ");
            int age = sc.nextInt();

            Day10Student student = new Day10Student(age, name);

            students[i-1] = student;
        }
        for (Day10Student student : students) {
            student.introduce();
        }
    }
}
