package LAB9.task4;

import LAB9.Ex1.Main;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
