package LAB1.TASK4;

import java.util.Scanner;

public class TASK4 {  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = scanner.nextInt();
    boolean isAdult = age >=18;
    System.out.println(isAdult);
}
}

