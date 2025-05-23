package LAB9.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmailNotification emailNotification = new EmailNotification();
        PushNotification pushNotification = new PushNotification();
        SMSNotification smsNotification = new SMSNotification();
        Notification[] notifications = new  Notification[]{emailNotification, pushNotification, smsNotification};

        for (Notification notification : notifications){
            notification.create();
            notification.send(notification.message);
        }
    }
}
