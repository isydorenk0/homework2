package Ex3;

public class Car {
    private int year;
    private int weight;
    private double speed;
    private String color;

    public Car(int year){
        this.year = year;
    }
    public Car(int year, int weight){
        this.year = year;
        this.weight = weight;
    }
    public Car(int year, int weight, double speed){
        this.year = year;
        this.weight = weight;
        this.speed = speed;
    }
    public Car(int year, int weight, double speed, String color){
        this.year = year;
        this.weight = weight;
        this.speed = speed;
        this.color = color;
    }
}
