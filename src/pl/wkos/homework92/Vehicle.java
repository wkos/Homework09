package pl.wkos.homework92;

public class Vehicle {
    private String name;
    private int fuelTankCapacity;
    private double averageMileage;

    public Vehicle(String name, int fuelTankCapacity, double averageMileage) {
        this.name = name;
        this.fuelTankCapacity = fuelTankCapacity;
        this.averageMileage = averageMileage;
    }

    public double getDistanceRadius() {
        return 0;
    }

    public void setAirConditionerOn(boolean airConditionerOn) {
    }

    @Override
    public String toString() {
        return  name + " Zbiornik paliwa: " + fuelTankCapacity + ", Spalanie: " + averageMileage;
    }

    public String getName() {
        return name;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public double getAverageMileage() {
        return averageMileage;
    }
}
