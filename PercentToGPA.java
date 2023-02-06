import java.util.Scanner;

public class PercentToGPA {
    public static void main(String[] args) {
        Double input;

        System.out.println("Type percentage score without % symbol and press ENTER:");

        Scanner inputScanner = new java.util.Scanner(System.in);

        input = inputScanner.nextDouble();

        if (100.0 >= input && input >= 95.0) {
            System.out.println(input + "% is a 4.0 GPA");
        } else if (95.0 > input && input >= 94.0) {
            System.out.println(input + "% is a 3.9 GPA");
        } else if (94.0 > input && input >= 93.0) {
            System.out.println(input + "% is a 3.8 GPA");
        } else if (93.0 > input && input >= 92.0) {
            System.out.println(input + "% is a 3.7 GPA");
        } else if (92.0 > input && input >= 91.0) {
            System.out.println(input + "% is a 3.6 GPA");
        } else if (91.0 > input && input >= 90.0) {
            System.out.println(input + "% is a 3.5 GPA");
        } else if (90.0 > input && input >= 89.0) {
            System.out.println(input + "% is a 3.4 GPA");
        } else if (89.0 > input && input >= 88.0) {
            System.out.println(input + "% is a 3.3 GPA");
        } else if (88.0 > input && input >= 87.0) {
            System.out.println(input + "% is a 3.2 GPA");
        } else if (87.0 > input && input >= 86.0) {
            System.out.println(input + "% is a 3.1 GPA");
        } else if (86.0 > input && input >= 85.0) {
            System.out.println(input + "% is a 3.0 GPA");
        } else if (85.0 > input && input >= 84.0) {
            System.out.println(input + "% is a 2.9 GPA");
        } else if (84.0 > input && input >= 83.0) {
            System.out.println(input + "% is a 2.8 GPA");
        } else if (83.0 > input && input >= 82.0) {
            System.out.println(input + "% is a 2.7 GPA");
        } else if (82.0 > input && input >= 81.0) {
            System.out.println(input + "% is a 2.6 GPA");
        } else if (81.0 > input && input >= 80.0) {
            System.out.println(input + "% is a 2.5 GPA");
        } else if (80.0 > input && input >= 79.0) {
            System.out.println(input + "% is a 2.4 GPA");
        } else if (79.0 > input && input >= 78.0) {
            System.out.println(input + "% is a 2.3 GPA");
        } else if (78.0 > input && input >= 77.0) {
            System.out.println(input + "% is a 2.2 GPA");
        } else if (77.0 > input && input >= 76.0) {
            System.out.println(input + "% is a 2.1 GPA");
        } else if (76.0 > input && input >= 75.0) {
            System.out.println(input + "% is a 2.0 GPA");
        } else if (75.0 > input && input >= 74.0) {
            System.out.println(input + "% is a 1.9 GPA");
        } else if (74.0 > input && input >= 73.0) {
            System.out.println(input + "% is a 1.8 GPA");
        } else if (73.0 > input && input >= 72.0) {
            System.out.println(input + "% is a 1.7 GPA");
        } else if (72.0 > input && input >= 71.0) {
            System.out.println(input + "% is a 1.6 GPA");
        } else if (71.0 > input && input >= 70.0) {
            System.out.println(input + "% is a 1.5 GPA");
        } else if (70.0 > input && input >= 69.0) {
            System.out.println(input + "% is a 1.4 GPA");
        } else if (69.0 > input && input >= 68.0) {
            System.out.println(input + "% is a 1.3 GPA");
        } else if (68.0 > input && input >= 67.0) {
            System.out.println(input + "% is a 1.2 GPA");
        } else if (67.0 > input && input >= 66.0) {
            System.out.println(input + "% is a 1.1 GPA");
        } else if (66.0 > input && input >= 65.0) {
            System.out.println(input + "% is a 1.0 GPA");       
        } else {
            System.out.println(input + "% is a 0.0 GPA");
        }
        
        inputScanner.close();
    }
}

