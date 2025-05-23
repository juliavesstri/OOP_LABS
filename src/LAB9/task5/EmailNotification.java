package LAB9.task5;

import java.util.Scanner;

public class EmailNotification extends Notification{
    @Override
    public void create(){
        System.out.print("Enter email message: ");
        scan();
    }

    @Override
    public void send(String message){
        System.out.printf("Sending email: %s%n", message);
    }
}
