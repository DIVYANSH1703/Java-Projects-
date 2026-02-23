import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();

        // Allowances (percentage based)
        double hra = basicSalary * 0.20;   // 20% HRA
        double da = basicSalary * 0.10;    // 10% DA

        double grossSalary = basicSalary + hra + da;

        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Gross Salary = " + grossSalary);

        input.close();
    }
}