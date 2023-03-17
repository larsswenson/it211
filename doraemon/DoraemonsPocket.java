package doraemon;

import java.util.ArrayList;

interface Storage {
    public void addItem(String itemName);
    public void removeItem(String itemName);
    public void printItems();
    public int getNumItems();
}

public class DoraemonsPocket implements Storage {

    private ArrayList<String> pocket;

    public DoraemonsPocket() {
        pocket = new ArrayList<String>();
    }

    @Override
    public void addItem(String itemName) {
        pocket.add(itemName);
    }

    @Override
    public void removeItem(String itemName) {
        pocket.remove(itemName);
    }

    @Override
    public void printItems() {
        for (String item : pocket) {
            System.out.println(item);
        }
    }

    @Override
    public int getNumItems() {
        return pocket.size();
    }
}

