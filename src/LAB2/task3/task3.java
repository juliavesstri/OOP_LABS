package LAB2.task3;

import java.util.Scanner;

public class task3 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введіть число a: ");
    int a = scanner.nextInt();
    System.out.print("Введіть число b: ");
    int b = scanner.nextInt();
    int max = a > b ? a : b;
    System.out.println("Максимальне число: " + max);
    scanner.close();
}
}
