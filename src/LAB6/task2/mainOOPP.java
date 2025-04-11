package LAB6.task2;

public class mainOOPP {public static void main(String[] args) {
    Car car = new Car();
    car.setCarBrand("Subaru");
    car.setCarModel("Forester");
    car.setCarSpeed(0);

    car.printCarInfo();
    System.out.println("Before acceleration:");
    car.accelerate(60);
    System.out.println("After acceleration:");
    car.printCarInfo();
}
}
