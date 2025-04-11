package LAB7.task3;

public class Car {String brand;
    String model;
    int speed;

    public Car(String brand, String model, int speed){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int value){
        speed += value;
    }

    public void brake(int value){
        if (speed < value){
            System.out.println("Speed cannot be negative");
            return;
        }else
            speed -= value;
    }

    public void carInfo(){
        System.out.printf("Brand: %s, Model: %s, Speed: %d\n", brand, model, speed);
    }
}
