package day12;

public class Day12ObjectArray {
    public static void main(String[] args) {

        Day12Student[] students = new Day12Student[3];

        students[0] = new Day12Student("철수", 15);
        students[1] = new Day12Student("영희", 14);
        students[2] = new Day12Student("민수", 16);

        for (int i = 0; i < 3; i++) {
            students[i].introduce();
        }

        for (Day12Student student : students) {
            student.introduce();
        }
    }
}
