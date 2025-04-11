package LAB3.task10;
import java.util.Scanner;
public class task10 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array length: ");
    int length = scanner.nextInt();
    int[] array = new int[length];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < length; i++) {
        System.out.println("Enter element " + i + ": ");
        array[i] = scanner.nextInt();
    }
    boolean foundDublicate = false;
    for (int i = 0; i < length; i++) {
        for (int j = i + 1; j < length; j++) {
            if (array[i] == array[j]) {
                System.out.println("Found dublicate: " + array[i]);
                foundDublicate = true;
                break;
            }
        }
    }
    if (!foundDublicate){
        System.out.println("No dublicates found");
    }
    scanner.close();
}
}
