package LAB5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        while (true){
            System.out.println("/n*** Меню ***");
            System.out.println("1. Переглянути баланс");
            System.out.println("2. Внести кошти");
            System.out.println("3. Зняти кошти");
            System.out.println("4. Вийти");
            System.out.println("Ваш вибір: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit(scanner);
                    break;
                case 3:
                    balance = withdraw(balance, scanner);
                    break;
                case 4:
                    System.out.println("Програма завершена. Дякуємо!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз");
            }
        }
    }

    public static void showBalance(double balance){
        System.out.printf("Поточний баланс: %.2f грн%n", balance);
    }

    public static double deposit(Scanner scanner){
        System.out.print("Введіть суму для внесення: ");
        double amount = scanner.nextDouble();

        if (amount > 0){
            System.out.printf("Успішно внесено: %.2f грн%n", amount);
            return amount;
        }else {
            System.out.println("Сума має бути більшою за 0");
            return 0;
        }
    }

    public static double withdraw(double balance, Scanner scanner){
        System.out.print("Введіть суму для зняття: ");
        double amount = scanner.nextDouble();

        if (amount <= 0){
            System.out.println("Сума має бути більшою за 0");
        }else if (amount > balance){
            System.out.println("Недостатньо коштів на рахунку");
        }else {
            balance -= amount;
            System.out.printf("Успішно знято: %.2f грн%n", amount);
        }
        return balance;
    }
}