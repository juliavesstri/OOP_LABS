package LAB5;

import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void task4 (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int diceCount = 0;
        int totalSum = 0;

        // 4. Запрос количества кубиков
        do {
            System.out.print("Enter number of dice to roll (must be > 0): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a positive integer: ");
                scanner.next();
            }
            diceCount = scanner.nextInt();
            if (diceCount <= 0) {
                System.out.println("Number must be greater than zero.");
            }
        } while (diceCount <= 0);

        // 6. Цикл имитации бросков кубиков
        for (int i = 1; i <= diceCount; i++) {
            int roll = random.nextInt(6) + 1;  // 1..6
            System.out.println("Dice #" + i + ":");
            print(roll);  // 7. Вывод ASCII-арта
            totalSum += roll;
            System.out.println();
        }

        // 8. Вывод суммы
        System.out.println("Total sum of all dice: " + totalSum);

        // 9. Закрытие Scanner
        scanner.close();
    }

    // Метод для вывода ASCII-арта кубика
    static void print(int roll) {
        switch (roll) {
            case 1 -> System.out.println("""
                    +-------+
                    |       |
                    |   o   |
                    |       |
                    +-------+""");
            case 2 -> System.out.println("""
                    +-------+
                    | o     |
                    |       |
                    |     o |
                    +-------+""");
            case 3 -> System.out.println("""
                    +-------+
                    | o     |
                    |   o   |
                    |     o |
                    +-------+""");
            case 4 -> System.out.println("""
                    +-------+
                    | o   o |
                    |       |
                    | o   o |
                    +-------+""");
            case 5 -> System.out.println("""
                    +-------+
                    | o   o |
                    |   o   |
                    | o   o |
                    +-------+""");
            case 6 -> System.out.println("""
                    +-------+
                    | o   o |
                    | o   o |
                    | o   o |
                    +-------+""");
            default -> System.out.println("Invalid dice roll");
        }
    }
}
