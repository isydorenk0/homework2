package Ex5;

public class MyArea {
    private int radius;
    private final double Pi = 3.14;
    public MyArea(int radius){
        this.radius = radius;
    }
    public double areaOfCircle(){
        return radius * Math.pow(Pi, 2);
    }
}
