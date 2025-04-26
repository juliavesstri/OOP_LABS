package LAB7.task4;
import java.util.Scanner;
public class Main {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter username:");
    String username = scanner.nextLine();
    UserAccount user = new UserAccount(username, "password666");

    System.out.print("Enter password: ");
    String enteredPassword1 = scanner.nextLine();
    user.login(enteredPassword1);

    System.out.print("Enter password: ");
    String enteredPassword2 = scanner.nextLine();
    user.login(enteredPassword2);

    System.out.print("Enter old password: ");
    String oldPassword1 = scanner.nextLine();
    System.out.print("Enter new password: ");
    String newPassword1 = scanner.nextLine();
    user.changePassword(oldPassword1, newPassword1);

    System.out.print("Enter old password: ");
    String oldPassword2 = scanner.nextLine();
    System.out.print("Enter new password: ");
    String newPassword2 = scanner.nextLine();
    user.changePassword(oldPassword2, newPassword2);

    System.out.print("Enter password: ");
    String enteredPassword3 = scanner.nextLine();
    user.login(enteredPassword3);

    scanner.close();
}
}
