package doraemon;

public class DoraemonsPocketDemo {
    public static void main(String[] args) {
        DoraemonsPocket pocket = new DoraemonsPocket();
        pocket.addItem("Bamboo-copter");
        pocket.addItem("Anywhere Door");
        pocket.printItems();
        pocket.removeItem("Bamboo-copter");
        System.out.println("Number of items: " + pocket.getNumItems());
    }
}

