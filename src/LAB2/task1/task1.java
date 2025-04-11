package LAB2.task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = sc. nextInt();

        if(number > 0) {
            System.out.println("Число є додатнім");
        } else if (number == 0) {
            System.out.println("Число дорівнює 0");
        } else {
            System.out.println("Число є від'ємним");
        }
    }
}