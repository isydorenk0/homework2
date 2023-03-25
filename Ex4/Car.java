package Ex4;

public class Car {
    private int year;
    private int weight;
    private double speed;
    private String color;

    public Car(int year){
        this(year, 1000);
    }
    public Car(int year, int weight){
        this(year, weight, 100);
    }
    public Car(int year, int weight, double speed){
        this(year, weight, speed, "White");
    }
    public Car(int year, int weight, double speed, String color){
        this.year = year;
        this.weight = weight;
        this.speed = speed;
        this.color = color;
    }
}
