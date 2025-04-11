package LAB3.task6;
import java.util.Scanner;
public class task6 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter array length; ");
    int size = scanner.nextInt();

    int[] array = new int[size];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < size; i++) {
        array[i] = scanner.nextInt();
    }

    int min = array[0], max = array[0], sum = 0, evenCount = 0;

    for (int num : array) {
        if (num < min) min = num;
        if (num > max) max = num;
        sum += num;
        if (num % 2 ==0) evenCount++;
    }

    double averege = (double) sum / size;

    System.out.println("Minimum: " + min);
    System.out.println("Maximum: " + max);
    System.out.printf("Averege: %.2f%n", averege);
    System.out.println("Sum: " + sum);
    scanner.close();
}
}
