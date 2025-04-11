package LAB4.task7;

public class task7 {
    static int counter = 0;
    public static void main(String[] args) {
        increment();
        increment();
        increment();
        System.out.println("Counter = " + counter);
    }
    public static int increment(){
        return counter++;
    }
}
