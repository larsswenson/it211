import java.util.Scanner;

public class PlayerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Create a player:");
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Strength (1-10): ");
        int strength = scanner.nextInt();
        
        System.out.print("Dexterity (1-10): ");
        int dexterity = scanner.nextInt();
        
        System.out.print("Hunger (1-10): ");
        int hunger = scanner.nextInt();
        
        System.out.print("Luck (1-10): ");
        int luck = scanner.nextInt();
        
        System.out.print("Height: (inches) ");
        double height = scanner.nextDouble();
        
        Player player = new Player(name, strength, dexterity, hunger, luck, height);
        
        player.run();
        player.fight();
        player.jump();
        player.pickUpItem();
    }
}

