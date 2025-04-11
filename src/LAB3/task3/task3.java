package LAB3.task3;

public class task3 {public static void main(String[] args) {
    System.out.println("Цикл for:");
    for (int i = 1; i <= 10; i++) {
        System.out.println(i + " * 7 = " + i * 7);
    }
    System.out.println("Цикл while:");
    int i = 1;
    while (i <= 10){
        System.out.println(i + " * 7 = " + i * 7);
        i++;
    }
    System.out.println("Цикл do while:");
    i = 1;
    do {
        System.out.println(i + " * 7 = " + i * 7);
        i++;
    } while (i <= 10);
}
}
