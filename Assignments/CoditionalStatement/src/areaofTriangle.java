import java.util.Scanner;

public class areaofTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Base and Height of the triangle: ");
        double Base = input.nextDouble();
        double Height = input.nextDouble();

        System.out.println("Area of Triangle :"+(0.5*Base*Height));
    }
}
