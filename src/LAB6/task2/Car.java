package LAB6.task2;

public class Car {private String carBrand;
    private String carModel;
    private int carSpeed;

    public void setCarBrand(String carBrand){
        this.carBrand = carBrand;
    }

    public String getCarBrand(){
        return carBrand;
    }

    public void setCarModel(String carModel){
        this.carModel = carModel;
    }

    public String getCarModel(){
        return carModel;
    }

    public void setCarSpeed(int carSpeed){
        this.carSpeed = carSpeed;
    }

    public int getCarSpeed(){
        return carSpeed;
    }

    public void accelerate(int increase){
        carSpeed += increase;
    }

    public void printCarInfo(){
        System.out.printf("Car brand: %s\nCar model: %s\nCar speed: %d\n", carBrand, carModel, carSpeed);
    }
}
