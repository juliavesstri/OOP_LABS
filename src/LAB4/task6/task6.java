package LAB4.task6;

public class task6 {public static void main(String[] args) {
    printNumber();
    // System.out.println(num); Не можем вивести num, так як ця змінна локальна та існує лише у методі printNumber()
}
    public static void printNumber(){
        int num = 10;
        System.out.println(num);
    }
}
