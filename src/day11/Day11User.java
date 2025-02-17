package day11;

public class Day11User {

    private String id;
    private String password;

    public Day11User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {

        if (password.length() < 8) {
            System.out.println("비밀번호가 8글자 미만입니다.");
            return false;
        }
        this.password = password;
        return true;
    }

}
