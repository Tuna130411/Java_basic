package day11;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class Day11Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Day11User user = new Day11User();

        System.out.print("아이디를 입력하세요: ");
        String id = sc.next();
        user.setId(id);

        System.out.print("비밀번호를 입력하세요: ");
        String password = sc.next();
        if (user.setPassword(password) == false) {
            return;
        }

        System.out.println("당신의 아이디: " + user.getId());
        System.out.println("당신의 비밀번호: " + user.getPassword());
        System.out.println("으로 가입이 완료되었습니다.\n");

        System.out.println("비밀번호 변경을 시작합니다.");
        System.out.println("로그인 후 진행됩니다.");

        System.out.print("아이디를 입력하세요: ");
        String userId = sc.next();

        System.out.print("비밀번호를 입력하세요: ");
        String userPassword = sc.next();

        if (userId.equals(user.getId()) && userPassword.equals(user.getPassword())) {
            System.out.println("로그인 성공!");
            System.out.print("새로운 비밀번호를 입력하세요: ");
            password = sc.next();
            user.setPassword(password);
            System.out.println("[변경 성공] 비밀번호 변경에 성공했습니다!");
            System.out.println("당신의 아이디: " + user.getId());
            System.out.println("당신의 비밀번호: " + user.getPassword());
        }
    }
}
