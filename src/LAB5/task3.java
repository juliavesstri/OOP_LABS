package LAB5;


import java.util.Scanner;

public class task3 {
    static void task3 (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2. Объявляем переменные
        double num1, num2, result = 0;
        char operator;

        // 3. Запрашиваем данные у пользователя
        System.out.print("Enter first number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Enter a valid number: ");
            scanner.next();
        }
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Enter a valid number: ");
            scanner.next();
        }
        num2 = scanner.nextDouble();

        boolean validOperation = true;

        // 4. Выбор операции с помощью switch
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                // 5. Проверка деления на ноль
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;

            case '^':
                result = Math.pow(num1, num2);
                break;

            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
        }

        // 6. Вывод результата
        if (validOperation) {
            System.out.printf("Result: %.4f\n", result);
        }

        // 7. Закрытие Scanner
        scanner.close();
    }
}
