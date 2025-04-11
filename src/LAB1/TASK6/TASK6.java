package LAB1.TASK6;

import java.util.Scanner;


public class TASK6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width of the rectangle (Use only real numbers): ");
        int width = scanner.nextInt();
        System.out.print("Enter height of the rectangle (Use only real numbers): ");
        int height = scanner.nextInt();
        System.out.println("Area of the rectangle: " + width * height);
        scanner.close();
    }
}

