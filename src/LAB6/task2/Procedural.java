package LAB6.task2;

public class Procedural {public static void main(String[] args) {
    String carBrand = "Subaru";
    String carModel = "Forester";
    int carSpeed = 0;
    System.out.println("Before car acceleration:");
    printCarInfo(carBrand, carModel, carSpeed);
    carSpeed = accelerate(carSpeed, 60);
    System.out.println("After car acceleration:");
    printCarInfo(carBrand, carModel, carSpeed);
}
    public static int accelerate(int curentSpeed, int increase){
        return curentSpeed + increase;
    }
    public static void printCarInfo(String carBrand, String carModel, int carSpeed){
        System.out.println("Car brand: " + carBrand);
        System.out.println("Car model; " + carModel);
        System.out.println("Car speed: " + carSpeed);
    }
}
