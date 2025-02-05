package day8;

import java.util.Scanner;

public class Day8Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] studentScores = new int[3][3];

        String[] subject = {"국어","수학","영어"};



        for (int i = 0; i < studentScores.length; i++) {
            for (int j = 0; j < studentScores[i].length; j++) {
                System.out.print("학생 " + (i+1) + "의 " + subject[j] + "점수를 입력하세요: ");
                studentScores[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < studentScores.length; i++) {
            double res = 0;
            int maxScores = studentScores[i][0];
            int minScores = studentScores[i][0];
            for (int j = 0; j < studentScores[i].length; j++) {
                res += studentScores[i][j];
                maxScores = maxScores < studentScores[i][j] ? studentScores[i][j] : maxScores;
                minScores = minScores > studentScores[i][j] ? studentScores[i][j] : minScores;
            }
            System.out.print("학생 " + (i+1) + " 총점: " + res + ", 평균: " + (res / studentScores.length));
            System.out.println(" 학생 " + (i+1) + " 최고점: " + maxScores + ", 최저점: " + minScores);
        }
    }
}
