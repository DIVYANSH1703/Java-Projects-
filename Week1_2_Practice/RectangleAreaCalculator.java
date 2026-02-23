import java.util.Scanner;

public class RectangleAreaCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter width of the rectangle: ");
        double width = input.nextDouble();

        // Calculating area
        double area = length * width;

        // Displaying result
        System.out.println("Area of the rectangle = " + area);

        input.close();
    }
}