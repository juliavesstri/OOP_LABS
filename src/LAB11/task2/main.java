package LAB11.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> tasks = new ArrayList<>();
    private static final List<Boolean> taskStatus = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = getUserChoice();
            handleUserChoice(choice);
        }
    }

    private static void showMenu() {
        System.out.println("\nTo-Do List:");
        System.out.println("1. List tasks");
        System.out.println("2. Add task");
        System.out.println("3. Mark task as done");
        System.out.println("4. Delete task");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    private static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Consume invalid input
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return choice;
    }

    private static void handleUserChoice(int choice) {
        switch (choice) {
            case 1 -> listTasks();
            case 2 -> addTask();
            case 3 -> markTaskAsDone();
            case 4 -> deleteTask();
            case 5 -> exitApp();
            default -> System.out.println("Invalid option. Try again.");
        }
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                String status = taskStatus.get(i) ? "[Done] " : "[Pending] ";
                System.out.println((i + 1) + ". " + status + tasks.get(i));
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        taskStatus.add(false);
        System.out.println("Task added!");
    }

    private static void markTaskAsDone() {
        System.out.print("Enter task number to mark as done: ");
        int doneIndex = getValidIndex();
        if (doneIndex != -1) {
            taskStatus.set(doneIndex, true);
            System.out.println("Task marked as done!");
        }
    }

    private static int getValidIndex() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid task number.");
            scanner.next();
        }
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline
        if (index < 0 || index >= tasks.size()) {
            System.out.println("Invalid task number.");
            return -1;
        }
        return index;
    }

    private static void deleteTask() {
        System.out.print("Enter task number to delete: ");
        int deleteIndex = getValidIndex();
        if (deleteIndex != -1) {
            tasks.remove(deleteIndex);
            taskStatus.remove(deleteIndex);
            System.out.println("Task deleted!");
        }
    }

    private static void exitApp() {
        System.out.println("Exiting...");
        scanner.close();
        System.exit(0);
    }
}
