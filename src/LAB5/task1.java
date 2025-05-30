package LAB5;



import java.util.Scanner;

public class task1 {
    public static void task1 (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double monthlyDeposit;
        double annualRate;
        int years;
        int timesCompounded;

        System.out.print("Enter the initial deposit amount (principal): ");
        principal = scanner.nextDouble();

        System.out.print("Enter the monthly deposit amount: ");
        monthlyDeposit = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a percentage): ");
        annualRate = scanner.nextDouble();

        System.out.println("Enter the number of year: ");
        years = scanner.nextInt();

        System.out.print("Enter the number of times interest is compounded per year: ");
        timesCompounded = scanner.nextInt();
    }
}
