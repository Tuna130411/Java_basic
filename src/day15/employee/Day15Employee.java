package day15.employee;

public abstract class Day15Employee {
    private String name;
    private String role;

    public Day15Employee(String name, String role) {
        this.role = role;
        this.name = name;
    }

    public void startWork() {
        System.out.println(name + " (" + role + ")이(가) 일을 시작합니다.");
    }

    public abstract void performDuties();

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}

