public class Box {
    private double width;
    private double height;
    private double depth;
    private String[] items;
    private int numItems;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.items = new String[10];
        this.numItems = 0;
    }

    public double volume() {
        return width * height * depth;
    }

    public void addItem(String item) {
        if (numItems < 10) {
            items[numItems] = item;
            numItems++;
        }
    }

    public void removeItem(String item) {
        for (int i = 0; i < numItems; i++) {
            if (items[i].equals(item)) {
                for (int j = i; j < numItems - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[numItems - 1] = null;
                numItems--;
                break;
            }
        }
    }

    public void printItems() {
        for (int i = 0; i < numItems; i++) {
            System.out.println(items[i]);
        }
    }
}
