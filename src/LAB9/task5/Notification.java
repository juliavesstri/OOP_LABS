package LAB9.task5;

import java.util.Scanner;

public class Notification {
    String message;
    public void scan(){
        Scanner scanner = new Scanner(System.in);
        this.message = scanner.nextLine();
    }

    public void create(){
        System.out.println("Enter message: ");
        scan();
    }
    public void send(String message){
        System.out.printf("Sending generic notification: %s%n", message);
    }
}