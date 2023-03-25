package Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = scanner.nextInt();
        MyArea myArea = new MyArea(radius);
        System.out.println("Area of the circle is: " + myArea.areaOfCircle());
    }
}
