package LAB12.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("1984", "George Orwell", 1949));
        items.add(new Magazine("National Geographic", 2023, 12));
        items.add(new DVD("Inception", 2010, 148));

        for (LibraryItem item : items) {
            System.out.println(item.getInfo());
            if (item instanceof Book book) {
                book.reserve();
            }
        }
    }
}
