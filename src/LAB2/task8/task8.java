package LAB2.task8;
import java.util.Scanner;
public class task8 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введіть email: ");

    String email = scanner.nextLine();
    int atIndex = email.indexOf("@");
    String username = email.substring(0, atIndex);
    String domain = email.substring(atIndex + 1);
    System.out.println("Username: " + username);
    System.out.println("Domain: " + domain);
    scanner.close();
}
}
