package LAB3.task9;
import java.util.Scanner;
public class task9 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array length: ");
    int length = scanner.nextInt();
    int[] array = new int[length];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < length; i++){
        System.out.print("Enter element " + i + " ");
        array[i] = scanner.nextInt();
    }
    System.out.print("Enter element`s index: ");
    int index = scanner.nextInt();
    System.out.print("Enter new value: ");
    int newValue = scanner.nextInt();
    array[index] = newValue;
    System.out.println("New array: ");
    for(int number : array){
        System.out.print(number + " ");
    }
    scanner.close();
}
}
