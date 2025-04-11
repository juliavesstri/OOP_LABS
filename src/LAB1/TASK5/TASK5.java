package LAB1.TASK5;

import java.util.Scanner;



public class TASK5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enyer if you are a student? (yes/no) ");
        boolean isStudent = scanner.nextLine().equalsIgnoreCase("yes");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Student: " + isStudent);
        scanner.close();
    }
}

