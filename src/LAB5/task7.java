package LAB5;

import java.util.Random;
import java.util.Scanner;

public class task7 {
    static final String[] SYMBOLS = {"🍒", "🔔", "🍋", "⭐", "💎"};

    public static void task7 (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100;
        int bet;
        String playAgain;

        // 1. Вітальне повідомлення
        System.out.println("Welcome to the Slot Machine!");
        System.out.println("Symbols: 🍒 🔔 🍋 ⭐ 💎");
        System.out.println("Rules:");
        System.out.println("- 3 matching symbols: win multiplied by x3, x4, x5, x10, x100");
        System.out.println("- 2 matching symbols: win multiplied by x2, x3, x4, x5, x6");
        System.out.println("- Otherwise, you lose your bet.");
        System.out.println("Starting balance: $100");

        do {
            System.out.println("\nCurrent balance: $" + balance);

            // 3. Запит ставки з перевіркою
            while (true) {
                System.out.print("Enter your bet: ");
                if (scanner.hasNextInt()) {
                    bet = scanner.nextInt();
                    if (bet > balance) {
                        System.out.println("Insufficient funds. Your balance: $" + balance);
                    } else if (bet <= 0) {
                        System.out.println("Invalid bet amount. Must be greater than zero.");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Please enter a valid number.");
                    scanner.next();
                }
            }

            balance -= bet; // 4. Віднімаємо ставку

            // 5. Обертання барабанів
            String[] spinResult = spinRow(random);

            // 6. Вивід результатів
            printRow(spinResult);

            // 7. Обчислення виграшу
            int payout = getPayout(spinResult, bet);
            if (payout > 0) {
                balance += payout;
                System.out.println("You won $" + payout + "!");
            } else {
                System.out.println("No win this time.");
            }

            scanner.nextLine(); // очищення буфера

            // 9. Запит на повтор гри
            if (balance == 0) {
                System.out.println("You have no more funds. Game over.");
                break;
            }

            System.out.print("Play again? (Y/N): ");
            playAgain = scanner.nextLine().trim().toUpperCase();
            while (!playAgain.equals("Y") && !playAgain.equals("N")) {
                System.out.print("Please enter 'Y' or 'N': ");
                playAgain = scanner.nextLine().trim().toUpperCase();
            }

        } while (playAgain.equals("Y"));

        // 5. Фінальне повідомлення
        System.out.println("Thanks for playing! Your final balance is $" + balance);
        scanner.close();
    }

    // Метод для генерації трьох випадкових символів
    static String[] spinRow(Random random) {
        String[] result = new String[3];
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(SYMBOLS.length);
            result[i] = SYMBOLS[index];
        }
        return result;
    }

    // Метод для виводу рядка
    static void printRow(String[] row) {
        System.out.println("+---+---+---+");
        System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " |");
        System.out.println("+---+---+---+");
    }

    // Метод для обчислення виграшу
    static int getPayout(String[] row, int bet) {
        // Множники для 3 і 2 однакових символів по порядку SYMBOLS
        int[] threeMatchMultipliers = {3, 4, 5, 10, 100};
        int[] twoMatchMultipliers = {2, 3, 4, 5, 6};

        // Підрахунок кількості збігів
        int matches3 = 0;
        int matches2 = 0;

        // Перевіряємо кожен символ у SYMBOLS
        for (int i = 0; i < SYMBOLS.length; i++) {
            String symbol = SYMBOLS[i];
            int count = 0;
            for (String s : row) {
                if (s.equals(symbol)) {
                    count++;
                }
            }
            if (count == 3) {
                matches3 = i;
                break; // 3 однакові - найвищий пріоритет
            } else if (count == 2) {
                matches2 = i;
            }
        }

        if (matches3 != 0 || (row[0].equals(row[1]) && row[1].equals(row[2]))) {
            // 3 однакові
            // matches3 містить індекс символу, якщо не 0 - виграш
            // У випадку якщо немає 3 однакових (matches3=0), перевіряємо чи всі рівні (рядок "row" з трьома однаковими символами)
            if (matches3 == 0 && row[0].equals(row[1]) && row[1].equals(row[2])) {
                // символ першого елемента
                for (int i = 0; i < SYMBOLS.length; i++) {
                    if (row[0].equals(SYMBOLS[i])) {
                        matches3 = i;
                        break;
                    }
                }
            }
            return bet * threeMatchMultipliers[matches3];
        } else if (matches2 != 0) {
            // 2 однакові
            return bet * twoMatchMultipliers[matches2];
        } else {
            return 0;
        }
    }
}
