package LAB12.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Список  книг
        List<String> availableBooks = new ArrayList<>();
        availableBooks.add("Pride and Prejudice by Jane Austen (1813)");
        availableBooks.add("Jane Eyre by Charlotte Brontë (1847)");
        availableBooks.add("Wuthering Heights by Emily Brontë (1847)");
        availableBooks.add("The Notebook by Nicholas Sparks (1996)");
        availableBooks.add("Me Before You by Jojo Moyes (2012)");

        // Список книг користувача
        List<String> borrowedBooks = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View available books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    if (availableBooks.isEmpty()) {
                        System.out.println("No books available right now.");
                    } else {
                        System.out.println("Available books:");
                        for (int i = 0; i < availableBooks.size(); i++) {
                            System.out.println((i + 1) + ". " + availableBooks.get(i));
                        }
                    }
                    break;

                case "2":
                    if (availableBooks.isEmpty()) {
                        System.out.println("No books to borrow.");
                        break;
                    }
                    System.out.println("Enter the number of the book to borrow:");
                    for (int i = 0; i < availableBooks.size(); i++) {
                        System.out.println((i + 1) + ". " + availableBooks.get(i));
                    }
                    String borrowInput = scanner.nextLine();
                    try {
                        int borrowIndex = Integer.parseInt(borrowInput) - 1;
                        if (borrowIndex >= 0 && borrowIndex < availableBooks.size()) {
                            String book = availableBooks.remove(borrowIndex);
                            borrowedBooks.add(book);
                            System.out.println("You borrowed: " + book);
                        } else {
                            System.out.println("Invalid book number.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;

                case "3":
                    if (borrowedBooks.isEmpty()) {
                        System.out.println("You have no borrowed books.");
                        break;
                    }
                    System.out.println("Enter the number of the book to return:");
                    for (int i = 0; i < borrowedBooks.size(); i++) {
                        System.out.println((i + 1) + ". " + borrowedBooks.get(i));
                    }
                    String returnInput = scanner.nextLine();
                    try {
                        int returnIndex = Integer.parseInt(returnInput) - 1;
                        if (returnIndex >= 0 && returnIndex < borrowedBooks.size()) {
                            String book = borrowedBooks.remove(returnIndex);
                            availableBooks.add(book);
                            System.out.println("You returned: " + book);
                        } else {
                            System.out.println("Invalid book number.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;

                case "4":
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
