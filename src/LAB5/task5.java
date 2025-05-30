package LAB5;


import java.util.Scanner;

public class task5  {
    public static void task5 (String[] args) {
        // 1. Массивы вопросов, вариантов и правильных ответов (индексы вариантов начинаются с 1)
        String[] questions = {
                "What is the capital of France?",
                "Which planet is known as the Red Planet?",
                "Who wrote 'Romeo and Juliet'?"
        };

        String[][] options = {
                {"1) London", "2) Paris", "3) Berlin", "4) Madrid"},
                {"1) Earth", "2) Mars", "3) Jupiter", "4) Saturn"},
                {"1) Charles Dickens", "2) William Shakespeare", "3) Mark Twain", "4) Leo Tolstoy"}
        };

        int[] correctAnswers = {2, 2, 2}; // номера правильных ответов

        // 2. Создаем Scanner
        Scanner scanner = new Scanner(System.in);

        // 3. Счетчик правильных ответов
        int score = 0;

        // 4. Цикл по вопросам
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);

            // Вывод вариантов
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Считываем ответ пользователя с проверкой
            int userAnswer = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Your answer (enter number): ");
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt();
                    if (userAnswer >= 1 && userAnswer <= options[i].length) {
                        validInput = true;
                    } else {
                        System.out.println("Please enter a number between 1 and " + options[i].length);
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // очищаем неправильный ввод
                }
            }

            // 5. Проверка правильности
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + correctAnswers[i]);
            }
            System.out.println();
        }

        // 6. Вывод результата
        System.out.println("Quiz finished! You scored " + score + " out of " + questions.length);

        // 7. Закрываем Scanner
        scanner.close();
    }
}
