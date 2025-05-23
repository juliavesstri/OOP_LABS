package LAB8.task4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.printf("Circle Area: %.2f;\nRectangle Area: %.2f%n", circle.area(), rectangle.   area());
    }
}
