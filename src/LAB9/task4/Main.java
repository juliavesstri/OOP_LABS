package LAB9.task4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle(4, 6);

        Shape[] shapes = new Shape[]{circle, rectangle};
        for (Shape shape : shapes){
            System.out.println("Area: " + shape.area());
        }
    }
}