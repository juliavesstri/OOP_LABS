package LAB2.task6;
import java.util.Scanner;
public class task6 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введіть число: ");
    double number = scanner.nextDouble();
    System.out.println("Квадратний корінь: " + Math.sqrt(number));
    System.out.println("Округлене значення: " + Math.round(number));
    System.out.println("Піднесене до квадрату: " + Math.pow(number, 2));
    System.out.println("Синус числа: " + Math.sin(number));
    scanner.close();
}
}
