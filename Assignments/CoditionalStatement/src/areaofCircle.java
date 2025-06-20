import java.util.Scanner;

public class areaofCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();
//        double area = Math.PI * Math.pow(radius, 2);

        double area = 3.14 * radius * radius;

        System.out.println("The area of the circle is " + area);
            }

}