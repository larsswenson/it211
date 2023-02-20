public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        System.out.println("Volume of box: " + box.volume());

        box.addItem("Item 1");
        box.addItem("Item 2");
        box.addItem("Item 3");
        System.out.println("Items in box:");
        box.printItems();

        box.removeItem("Item 2");
        System.out.println("Items in box after removing Item 2:");
        box.printItems();
    }
}