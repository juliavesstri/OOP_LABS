package LAB8.task4;


public class Circle extends Shape{

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius;
    }
}