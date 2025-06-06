package LAB5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] questions = {
                "1. Злодій зумів … з великою сумою грошей до прибуття поліції.",
                "2. Вона вирішила … пропозицію, хоча вона була дуже спокусливою.",
                "3. Після тривалої хвороби він нарешті почав … сили.",
                "4. Учитель попросив учнів … завдання до наступного уроку."
        };
        String[][] answers = {
                {"a) втекти", "b) утекти з награбованим", "c) захопити контроль"},
                {"a) відхилити пропозицію", "b) розірвати стосунки", "c) відкласти на потім"},
                {"a) одужати", "b) спричинити", "c) вибухнути/зіпсуватись"},
                {"a) вирушити", "b) здати (роботу)", "c) почати (нову справу)"}
        };
        String[] correctAnswers = {"b", "a", "a", "b"};

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String answer : answers[i]) {
                System.out.println(answer);
            }
            System.out.print("Введіть вашу відповідь (a, b або c): ");
            String userAnswer = scanner.nextLine().toLowerCase();
            boolean validAnswer = false;

            while (!validAnswer) {
                if (userAnswer.equals("a") || userAnswer.equals("b") || userAnswer.equals("c")) {
                    validAnswer = true;
                } else {
                    System.out.print("Неправильна відповідь. Будь ласка, введіть a, b або c: ");
                    userAnswer = scanner.nextLine().toLowerCase();
                }
            }
            if (userAnswer.equals(correctAnswers[i])) {
                System.out.println("Молодець! Це правильна відповідь!");
                score++;
            } else {
                System.out.println("На жаль, це неправильна відповідь. Правильна відповідь: " + correctAnswers[i]);
            }
            System.out.println();
        }

        System.out.println("Ваш результат: " + score + " з " + questions.length);

        scanner.close();
    }
}
