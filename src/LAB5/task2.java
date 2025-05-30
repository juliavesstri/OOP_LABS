package LAB5;

import java.util.Scanner;

public  class task2 {
    static void task2 (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        do {
            // 4. Вивід меню
            System.out.println("\nBank Account Menu:");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // 5. Отримати вибір користувача
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number from 1 to 4.");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit(scanner);
                    break;
                case 3:
                    balance -= withdraw(scanner, balance);
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please select 1-4.");
            }

        } while (choice != 4);

        scanner.close();
    }

    // Метод для відображення балансу
    static void showBalance(double balance) {
        System.out.printf("Current balance: %.2f\n", balance);
    }

    // Метод для внесення коштів
    static double deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount;
        while (true) {
            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
                if (amount > 0) {
                    break;
                } else {
                    System.out.print("Amount must be positive. Try again: ");
                }
            } else {
                System.out.print("Invalid input. Enter a valid number: ");
                scanner.next();
            }
        }
        System.out.printf("Deposited: %.2f\n", amount);
        return amount;
    }

    // Метод для зняття коштів
    static double withdraw(Scanner scanner, double balance) {
        System.out.print("Enter amount to withdraw: ");
        double amount;
        while (true) {
            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
                if (amount <= 0) {
                    System.out.print("Amount must be positive. Try again: ");
                } else if (amount > balance) {
                    System.out.print("Insufficient funds. Enter a smaller amount: ");
                } else {
                    break;
                }
            } else {
                System.out.print("Invalid input. Enter a valid number: ");
                scanner.next();
            }
        }
        System.out.printf("Withdrawn: %.2f\n", amount);
        return amount;
    }
}
