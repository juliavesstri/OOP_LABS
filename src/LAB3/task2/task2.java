package LAB3.task2;
import java.util.Random;
import java.util.Scanner;
public class task2 {public static void main(String[] args) {
    //ініцілізувати вхідні дані (генератор чисел, сканер, змінні)
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int guess;
    int attemps = 0;
    int min;
    int max;

    //Отримати данні від користувача

    System.out.println("Гра Відгадай число!");
    System.out.print("Введіть мінімальне: ");
    min = scanner.nextInt();
    System.out.print("Введіть максимальне: ");
    max = scanner.nextInt();

    int randomNumber = random.nextInt(min, max);
    System.out.printf("Введіть число від %d до %d: ", min, max);

    // do while догіку по обропці спроб користувача

    do{
        System.out.print("Введіть чсисло: ");
        guess = scanner.nextInt();
        attemps++;

        if (guess < randomNumber){
            System.out.println("Спробуйте більше число!");
        } else if (guess > randomNumber){
            System.out.println("Спробуйте меньше число!");
        } else {
            System.out.println("Вітаєіомо! Ви відгадали загадене число!");
            System.out.println("Ви використали: " + attemps);
        }
    } while (guess != randomNumber);

    // завершення программи
    System.out.println("Завершення програми!");
    scanner.close();
}
}
