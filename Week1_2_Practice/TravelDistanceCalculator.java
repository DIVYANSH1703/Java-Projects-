import java.util.Scanner;

public class TravelDistanceCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance from City A to City B (km): ");
        double distanceAB = input.nextDouble();

        System.out.print("Enter distance from City B to City C (km): ");
        double distanceBC = input.nextDouble();

        System.out.print("Enter total time taken (hours): ");
        double totalTime = input.nextDouble();

        double totalDistance = distanceAB + distanceBC;

        double averageSpeed = totalDistance / totalTime;

        System.out.println("Total Distance = " + totalDistance + " km");
        System.out.println("Average Speed = " + averageSpeed + " km/hr");

        input.close();
    }
}