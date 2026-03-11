import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int[] table = new int[10];

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        // Display table
        System.out.println("\nMultiplication Table:");

        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}