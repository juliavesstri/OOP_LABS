package LAB5;

import java.util.Random;
import java.util.Scanner;

public class task6  {
    public static void task6 (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        do {
            // 5. Считываем и проверяем выбор игрока
            while (true) {
                System.out.print("Enter your choice (rock, paper, scissors): ");
                playerChoice = scanner.nextLine().trim().toLowerCase();
                if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }

            // 6. Генерируем выбор компьютера
            computerChoice = options[random.nextInt(options.length)];
            System.out.println("Computer chose: " + computerChoice);

            // 7. Определяем победителя
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                    (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                            (playerChoice.equals("paper") && computerChoice.equals("rock"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            // 9. Спрашиваем, хочет ли игрок сыграть еще раз
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().trim().toLowerCase();

            while (!playAgain.equals("yes") && !playAgain.equals("no")) {
                System.out.print("Please enter 'yes' or 'no': ");
                playAgain = scanner.nextLine().trim().toLowerCase();
            }

        } while (playAgain.equals("yes"));

        // 10. Финальное сообщение и закрытие сканера
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

