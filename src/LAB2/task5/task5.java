package LAB2.task5;
import java.util.Scanner;
public class task5 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введіть рядок: ");
    String str = scanner.nextLine();
    System.out.println("Довжина рядка: " + str.length());
    System.out.println("Перший символ: " + str.charAt(0));
    System.out.println("Останній символ: " + str.charAt(str.length() - 1));
    System.out.println("Верхній регістр: " + str.toUpperCase());
    System.out.println("Нижній регістр: " + str.toLowerCase());
    System.out.println("Витягує підрядок: " + str.substring(0, 3));
    System.out.println("Перевіряє чи містіть слово 'Java': " + str.contains("Java"));
    scanner.close();
}
}
