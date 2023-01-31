import java.util.Scanner;

public class LitersToGallonsInput {
    public static void main(String[] args) {
    double liters;
    double gallons;

    System.out.println("Type liter amount and press ENTER:");

    Scanner inputScanner = new java.util.Scanner(System.in);

    liters = inputScanner.nextDouble();

    gallons = 0.264172 * liters;

    System.out.println(liters + " liters is " + gallons + " gallons.");

    inputScanner.close();
    }
}
