import java.util.Scanner;

public class GPAtoPercent {
    public static void main(String[] args) {
        String input;

        System.out.println("To convert to percentage, type GPA and press ENTER:");

        Scanner inputScanner = new java.util.Scanner(System.in);

        input = inputScanner.nextLine();

            switch (input) {
                case "0.0":
                    System.out.println("GPA 0 is 0-65%");
                    break;
                case "1.0":
                    System.out.println("GPA 1.0 is 65-66%");
                    break;
                case "1.1":
                    System.out.println("GPA 1.1 is 66-67%");
                    break;
                case "1.2":
                    System.out.println("GPA 1.2 is 67-68%");
                    break;
                case "1.3":
                    System.out.println("GPA 1.3 is 68-69%");
                    break;
                case "1.4":
                    System.out.println("GPA 1.4 is 69-70%");
                    break;
                case "1.5":
                    System.out.println("GPA 1.5 is 70-71%");
                    break;
                case "1.6":
                    System.out.println("GPA 1.6 is 71-72%");
                    break;
                case "1.7":
                    System.out.println("GPA 1.7 is 72-73%");
                    break;
                case "1.8":
                    System.out.println("GPA 1.8 is 73-74%");
                    break;
                case "1.9":
                    System.out.println("GPA 1.9 is 74-75%");
                    break;
                case "2.0":
                    System.out.println("GPA 2.0 is 75-76%");
                    break;
                case "2.1":
                    System.out.println("GPA 2.1 is 76-77%");
                    break;
                case "2.2":
                    System.out.println("GPA 2.2 is 77-78%");
                    break;
                case "2.3":
                    System.out.println("GPA 2.3 is 78-79%");
                    break;
                case "2.4":
                    System.out.println("GPA 2.4 is 79-80%");
                    break;
                case "2.5":
                    System.out.println("GPA 2.5 is 80-81%");
                    break;
                case "2.6":
                    System.out.println("GPA 2.6 is 81-82%");
                    break;
                case "2.7":
                    System.out.println("GPA 2.7 is 82-83%");
                    break;
                case "2.8":
                    System.out.println("GPA 2.8 is 83-84%");
                    break;
                case "2.9":
                    System.out.println("GPA 2.9 is 84-85%");
                    break;
                case "3.0":
                    System.out.println("GPA 3.0 is 85-86%");
                    break;
                case "3.1":
                    System.out.println("GPA 3.1 is 86-87%");
                    break;
                case "3.2":
                    System.out.println("GPA 3.2 is 87-88%");
                    break;
                case "3.3":
                    System.out.println("GPA 3.3 is 88-89%");
                    break;
                case "3.4":
                    System.out.println("GPA 3.4 is 89-90%");
                    break;
                case "3.5":
                    System.out.println("GPA 3.5 is 90-91%");
                    break;
                case "3.6":
                    System.out.println("GPA 3.6 is 91-92%");
                    break;
                case "3.7":
                    System.out.println("GPA 3.7 is 92-93%");
                    break;
                case "3.8":
                    System.out.println("GPA 3.8 is 93-94%");
                    break;
                case "3.9":
                    System.out.println("GPA 3.9 is 94-95%");
                    break;
                case "4.0":
                    System.out.println("GPA 4.0 is 95-100%");
                    break;
        }
    }
}
