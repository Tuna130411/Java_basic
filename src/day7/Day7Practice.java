package day7;

import java.util.Scanner;

public class Day7Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1번 문제

        System.out.print("학생 수를 입력하세요: ");
        int len1 = sc.nextInt();
        int[] stu = new int[len1];

        double res1 = 0;

        for (int i = 0; i<stu.length; i++) {
            System.out.print("학생들의 점수를 입력해주세요. 학생 " + (i + 1) + ": ");
            stu[i] = sc.nextInt();
            res1 += stu[i];
        }

        System.out.println("학생들의 평균 점수는: " + (res1 / stu.length));

        // 2번 문제

        System.out.print("배열의 크기를 입력하세요: ");
        int len2 = sc.nextInt();
        int[] num = new int[len2];

        for (int i = 0; i<num.length; i++) {
            System.out.print((i + 1) + "번째 숫자를 입력해주세요: ");
            num[i] = sc.nextInt();
        }
        int maxNum = num[0];
        int minNum = num[0];

        for (int i = 0; i<num.length; i++) {
            maxNum = maxNum < num[i] ? num[i] : maxNum;
            minNum = minNum > num[i] ? num[i] : minNum;
        }
        System.out.println("최대값은: " + maxNum);
        System.out.println("최솟값은: " + minNum);
        }
    }
