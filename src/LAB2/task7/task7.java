package LAB2.task7;
import java.util.Random;
import java.util.Scanner;
public class task7 {  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    System.out.print("Введіть мінімальне значення: ");
    int min = scanner.nextInt();
    System.out.print("Введіть максимальне значення: ");
    int max = scanner.nextInt();
    int randomInt = random.nextInt(min, max);
    String evenOdd = randomInt % 2 == 0 ? "парним" : "непарним";
    System.out.printf("Згенероване число: %d%nЧисло %d є %s%n", randomInt, randomInt, evenOdd);
    scanner.close();
}
}
