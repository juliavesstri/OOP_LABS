package LAB7.task3;

public class Main {public static void main(String[] args) {
    Car car = new Car("Subaru", "Forester", 0);

    car.accelerate(40);
    car.brake(20);
    car.brake(40);

    car.carInfo();
}
}
