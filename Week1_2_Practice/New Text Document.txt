import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking marks as input
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = input.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = input.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = input.nextInt();

        // Calculating total
        int totalMarks = subject1 + subject2 + subject3;

        // Type conversion from int to double
        double percentage = (double) totalMarks / 3;

        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage = " + percentage);

        input.close();
    }
}