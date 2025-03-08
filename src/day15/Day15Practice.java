package day15;

import day15.employee.Day15Artist;
import day15.employee.Day15Chef;
import day15.employee.Day15Developer;
import day15.employee.Day15Doctor;
import day15.teacher.Day15EnglishTeacher;
import day15.teacher.Day15MathTeacher;
import day15.teacher.Day15ScienceTeacher;
import day15.teacher.Day15Teacher;

public class Day15Practice {
    public static void main(String[] args) {

        Day15Doctor doctor = new Day15Doctor("의사");
        Day15Developer developer = new Day15Developer("개발자");
        Day15Chef chef = new Day15Chef("요리사");
        Day15Artist artist = new Day15Artist("화가");

        Day15MathTeacher mathTeacher = new Day15MathTeacher("수학 선생님");
        Day15EnglishTeacher englishTeacher = new Day15EnglishTeacher("영어 선생님");
        Day15ScienceTeacher scienceTeacher = new Day15ScienceTeacher("과학 선생님");

        doctor.startWork();
        developer.startWork();
        chef.startWork();
        artist.startWork();
        System.out.println();

        doctor.performDuties();
        developer.performDuties();
        chef.performDuties();
        artist.performDuties();
        System.out.println();

        Day15Teacher[] teachers = new Day15Teacher[3];

        teachers[0] = mathTeacher;
        teachers[1] = englishTeacher;
        teachers[2] = scienceTeacher;

        for (Day15Teacher teacher : teachers) {
            teacher.introduce();
        }
        System.out.println();

        for (Day15Teacher teacher : teachers) {
            teacher.teachSubject();
        }
    }
}
