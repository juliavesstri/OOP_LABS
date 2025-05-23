package LAB8.task4;


public class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }
}
