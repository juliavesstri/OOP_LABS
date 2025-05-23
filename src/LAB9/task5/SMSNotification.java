package LAB9.task5;


import java.util.Scanner;

public class SMSNotification extends Notification{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void create(){
        System.out.print("Enter SMS message: ");
        scan();
    }
    @Override
    public void send(String message){
        System.out.printf("Sending SMS: %s%n", message);
    }
}
