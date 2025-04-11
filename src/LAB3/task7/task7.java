package LAB3.task7;
import java.util.Arrays;
import java.util.Random;
public class task7 { public static void main(String[] args) {
    Random random = new Random();

    int array[] = new int[10];
    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(1, 100) + 1;
    }
    System.out.println("Array before sorting: ");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }

    Arrays.sort(array);

    System.out.println("Sorted array: ");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
}
}
