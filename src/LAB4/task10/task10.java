package LAB4.task10;

public class task10 { public static void main(String[] args) {
    printNumbers("Numbers are: ", 1, 16, 22, 0, 17, 5);
    printNumbers("Students ages are: ", 18, 18, 17, 22, 17, 20, 19);
}
    public static void printNumbers(String message, int... numbers){
        System.out.println(" ");
        System.out.print(message);
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}
