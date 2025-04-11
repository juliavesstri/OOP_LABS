package LAB1.TASK2;

import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:  ");
        double radius = scanner.nextDouble();
        System.out.println(3.14 * radius * radius);
        scanner.close();
    }
}
