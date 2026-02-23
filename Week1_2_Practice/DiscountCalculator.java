import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double originalPrice = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercentage = input.nextDouble();

       
        double discountAmount = (originalPrice * discountPercentage) / 100;


        double finalPrice = originalPrice - discountAmount;

        System.out.println("Discount Amount = " + discountAmount);
        System.out.println("Final Price = " + finalPrice);

        input.close();
    }
}