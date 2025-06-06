package LAB5;

import java.util.Scanner;

public class task3  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber;
        String choice;
        double secondNumber;

        System.out.println("*** Меню ***");
        System.out.println("Плюс (+)");
        System.out.println("минус (-)");
        System.out.println("множення (*)");
        System.out.println("ділення (/)");
        System.out.println("до степеня (^)");
        System.out.println("вихід");
        System.out.print("введіть перше число  ");
        firstNumber = scanner.nextDouble();
        System.out.print("Оберіть операцію(+, -, *, /, ^): ");
        choice = scanner.next();

        System.out.print("введіть друге число ");
        secondNumber = scanner.nextDouble();

        switch (choice){
            case "+":
                plus(firstNumber, secondNumber);
                break;
            case "-":
                minus(firstNumber, secondNumber);
                break;
            case "*":
                multiply(firstNumber, secondNumber);
                break;
            case "/":
                divide(firstNumber, secondNumber);
                break;
            case "^":
                power(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid choice. Try again");
        }

        scanner.close();
    }
    public static void plus (double firstNumber, double secondNumber){
        double result = firstNumber + secondNumber;
        System.out.println("результат " + result);
    }

    public static void minus (double firstNumber, double secondNumber){
        double result = firstNumber - secondNumber;
        System.out.println("результат " + result);
    }

    public static void multiply (double firstNumber, double secondNumber){
        double result = firstNumber * secondNumber;
        System.out.println("результат " + result);
    }

    public static void divide (double firstNumber, double secondNumber){
        if (secondNumber != 0){
            double result = firstNumber / secondNumber;
            System.out.println("результат " + result);
        }else {
            System.out.println("Ділення на нуль заборонене. Спробуйте ще раз");
            return;
        }
    }

    public static void power (double firstNumber, double secondNumber){
        double result = Math.pow(firstNumber, secondNumber);
        System.out.println("Result is: " + result);
    }

}