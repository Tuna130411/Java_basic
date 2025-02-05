package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Day8DeepArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 길이를 입력하세요: ");
        int len = sc.nextInt();
        int[] scores = new int[len];

        for (int i = 0; i<scores.length; i++) {
            System.out.print("수를 입력하세요: ");
            scores[i] = sc.nextInt();
        }

        System.out.print("50점 이상인 점수: ");
        for (int score : scores) {
            if (score >= 50) {
                System.out.print(score + " ");
            }
        }

        int[] scores1 = {45, 67, 89, 72, 50};
        Arrays.sort(scores1);
        System.out.println("정렬된 점수: " + Arrays.toString(scores1));

        for (int i = 0; i < scores1.length / 2; i++) {
            int temp = scores1[i];
            scores1[i] = scores1[scores1.length - 1 - i];
            scores1[scores1.length - i - 1] = temp;
        }
        System.out.println("내림차순 정렬 = " + Arrays.toString(scores1));

        int[][] studentScores = {
                {85, 90, 92},
                {78, 88, 80},
                {90, 94, 99}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(studentScores[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("배열의 행을 입력하세요: ");
        int col = sc.nextInt();
        System.out.print("배열의 열을 입력하세요: ");
        int row = sc.nextInt();

        int[][] array = new int[col][row];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(i + "행 " + j + "열의 숫자를 입력하세요: ");
                array[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
