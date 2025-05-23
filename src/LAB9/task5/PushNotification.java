package LAB9.task5;

import java.util.Scanner;

public class PushNotification extends Notification{
    @Override
    public void create(){
        System.out.print("Enter push notification message: ");
        scan();
    }

    @Override
    public void send(String message){
        System.out.printf("Sending push notification: %s%n", message);
    }
}
