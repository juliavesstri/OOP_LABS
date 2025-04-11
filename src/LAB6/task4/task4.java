package LAB6.task4;

public class task4 {public static void main(String[] args) {

    Counter counter1 = new Counter();
    Counter counter2 = new Counter();

    counter1.increment();
    counter2.increment();
    counter2.increment();

    System.out.println("First counter count: " + counter1.getCount());
    System.out.println("Second counter count: " + counter2.getCount());

    StaticCounter.increment();
    StaticCounter.increment();
    StaticCounter.increment();
    StaticCounter.increment();

    System.out.println("Static counter count: " + StaticCounter.getCount());

    StaticCounter.increment();

    System.out.println("Static counter after increment: " + StaticCounter.getCount());
}
}
