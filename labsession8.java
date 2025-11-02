import java.util.ArrayList;

class Box<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("Items in the box:");
        for (T item : items) {
            System.out.println(item);
        }
        System.out.println();
    }
}


public class GenericBoxDemo {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.addItem(10);
        intBox.addItem(20);
        intBox.addItem(30);

        Box<String> stringBox = new Box<>();
        stringBox.addItem("Laptop");
        stringBox.addItem("Mouse");
        stringBox.addItem("Keyboard");

        Box<Double> doubleBox = new Box<>();
        doubleBox.addItem(10.5);
        doubleBox.addItem(25.7);

        intBox.displayItems();
        stringBox.displayItems();
        doubleBox.displayItems();
    }
}
