package LAB11.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();
        List<Boolean> taskStatus = new ArrayList<>();

        while (true) {

            System.out.println("\nМеню:");
            System.out.println("1. Показати всі задачі");
            System.out.println("2. Додати нову задачу");
            System.out.println("3. Позначити задачу як виконану");
            System.out.println("4. Видалити задачу");
            System.out.println("5. Вийти");
            System.out.print("Виберіть дію: ");

            String input = scanner.nextLine();
            int choice;

            // Перевірка коректності вводу числа
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("число від 1 до 5.");
                continue;
            }

            switch (choice) {
                case 1:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            String status = taskStatus.get(i) ? "[Done] " :
                                    "[Pending] ";
                            System.out.println((i + 1) + ". " + status +
                                    tasks.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    taskStatus.add(false);
                    System.out.println("Task added!");
                    break;

                case 3:
                System.out.print("Enter task number to mark as done: ");
                int doneIndex = scanner.nextInt() - 1;
                if (doneIndex >= 0 && doneIndex < tasks.size()) {
                    taskStatus.set(doneIndex, true);
                    System.out.println("Task marked as done!");
                } else {
                    System.out.println("Invalid task number.");
                }
                break;

                case 4:
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    if (deleteIndex >= 0 && deleteIndex < tasks.size()) {
                        tasks.remove(deleteIndex);
                        taskStatus.remove(deleteIndex);
                        System.out.println("Task deleted!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
