package LAB9.task1;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum1 = calculator.add(6, 10);
        int sum2 = calculator.add(6, 10, 15);
        double sum3 = calculator.add(6.5, 10.5);

        System.out.printf(" Sum of integers: %d%n Sum of 3 integers %d%n Sum of doubles: %.2f%n", sum1,sum2, sum3);
    }
}
