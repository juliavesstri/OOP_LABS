package LAB5;

import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int amountOfCubes;
        int sum = 0;

        System.out.print("Enter amount of dice to roll: ");
        amountOfCubes = scanner.nextInt();

        if (amountOfCubes <= 0){
            System.out.println("Invalid amount of dice. Please enter a positive number");
        } else {
            for (int i = 0; i < amountOfCubes; i++){
                int roll = random.nextInt(1, 7);
                print(roll);
                sum += roll;
            }
            System.out.println("Sum of all dice: " + sum);
        }
        scanner.close();
    }

    static void print(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);

        }
    }
}