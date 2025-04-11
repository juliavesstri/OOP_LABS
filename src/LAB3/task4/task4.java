package LAB3.task4;
import java.util.Scanner;
public class task4 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter N: ");
    int N = scanner.nextInt();
    int sum = 0;
    for (int i = 1; i <= N; i++) {
        System.out.println(sum + " + " + i + " = " + (i + sum));
        sum += i;
    }
}
}
