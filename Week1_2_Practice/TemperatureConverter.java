import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Formula: (C * 9/5) + 32
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);

        input.close();
    }
}