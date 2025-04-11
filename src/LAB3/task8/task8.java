package LAB3.task8;
import java.util.Scanner;
public class task8 {  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    System.out.println("Enter number to search: ");
    int target = scanner.nextInt();

    boolean found = false;
    for (int number : array){
        if (number == target){
            found = true;
            break;
        }
    }
    if (found){
        System.out.println("Number " + target + " is found");
    } else {
        System.out.println("Number " + target + " is not found");
    }
    scanner.close();
}
}
