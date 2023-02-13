import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String input;

        System.out.println("Please type a string and press ENTER:");

        Scanner inputScanner = new java.util.Scanner(System.in);

        input = inputScanner.nextLine();

        System.out.println(input.toUpperCase());

        System.out.println(input.toLowerCase());

        System.out.println(input.hashCode());
    }
}
