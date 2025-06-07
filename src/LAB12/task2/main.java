package LAB12.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    static List<String> books = new ArrayList<>();
    static List<String> borrowedBooks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        books.add("Pride and Prejudice by Jane Austen (1813)");
        books.add("Jane Eyre by Charlotte Brontë (1847)");
        books.add("Wuthering Heights by Emily Brontë (1847)");

        boolean running = true;
        while (running) {
            showMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1 -> viewBooks();
                case 2 -> borrowBook();
                case 3 -> returnBook();
                case 4 -> {
                    System.out.println("Вихід з програми.");
                    running = false;
                }
                default -> System.out.println("Неправильний вибір. Спробуйте ще раз.");
            }
        }
        scanner.close();
    }

    static void showMenu() {
        System.out.println("\n=== МЕНЮ ===");
        System.out.println("1. Переглянути список книг");
        System.out.println("2. Позичити книгу");
        System.out.println("3. Повернути книгу");
        System.out.println("4. Вийти");
        System.out.print("Ваш вибір: ");
    }

    static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Будь ласка, введіть число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static void viewBooks() {
        System.out.println("\n--- Доступні книги ---");
        if (books.isEmpty()) {
            System.out.println("Наразі немає доступних книг.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }

    static void borrowBook() {
        viewBooks();
        if (books.isEmpty()) return;

        System.out.print("Введіть номер книги, яку хочете позичити: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // очищення буфера

        if (index > 0 && index <= books.size()) {
            String book = books.remove(index - 1);
            borrowedBooks.add(book);
            System.out.println("Ви позичили: " + book);
        } else {
            System.out.println("Невірний номер книги.");
        }
    }

    static void returnBook() {
        System.out.println("\n--- Ваші позичені книги ---");
        if (borrowedBooks.isEmpty()) {
            System.out.println("У вас немає позичених книг.");
            return;
        }

        for (int i = 0; i < borrowedBooks.size(); i++) {
            System.out.println((i + 1) + ". " + borrowedBooks.get(i));
        }

        System.out.print("Введіть номер книги для повернення: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // очищення буфера

        if (index > 0 && index <= borrowedBooks.size()) {
            String book = borrowedBooks.remove(index - 1);
            books.add(book);
            System.out.println("Ви повернули: " + book);
        } else {
            System.out.println("Невірний номер.");
        }
    }
}
