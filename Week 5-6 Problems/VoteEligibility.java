import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] ages = new int[10];

       
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        System.out.println("\nVoting Eligibility:");

       
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("Invalid age entered.");
            }
            else if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote.");
            }
            else {
                System.out.println("Student with age " + ages[i] + " cannot vote.");
            }
        }

        input.close();
    }
}