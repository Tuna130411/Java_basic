package day9;

public class Gun {

    public String name;
    public String type;
    public int range;
    public double weight;

    public void info(){
        System.out.println("이름 : " + name);
        System.out.println("유형 : " + type);
        System.out.println("사거리 : " + range + "m");
        System.out.println("무게 : " + weight + "kg\n");
    }
}
