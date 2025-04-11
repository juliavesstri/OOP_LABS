package LAB3.task5;
import java.util.Random;
import java.util.Scanner;
public class task5 { public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enterv array length: ");
    int arrayLength = scanner.nextInt();
    int[] Array = new int[arrayLength];
    for (int i = 0; i < arrayLength; i++) {
        Array[i] = random.nextInt(1,100);
    }
    for(int array : Array){
        System.out.print(array + " ");
    }
}
}
