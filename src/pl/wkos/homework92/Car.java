package pl.wkos.homework92;

public class Car extends Vehicle {
    private boolean airConditionerOn;

    public Car(String name, int fuelTankCapacity, double averageMileage, boolean airConditionerOn) {
        super(name, fuelTankCapacity, averageMileage);
        this.airConditionerOn = airConditionerOn;
    }

    @Override
    public double getAverageMileage() {
        if (airConditionerOn) return super.getAverageMileage() + 0.8;
        else return super.getAverageMileage();
    }

    @Override
    public double getDistanceRadius() {
        return super.getFuelTankCapacity() / getAverageMileage() * 100;
    }

    @Override
    public void setAirConditionerOn(boolean airConditionerOn) {
        this.airConditionerOn = airConditionerOn;
    }

    public boolean isAirConditionerOn() {
        return airConditionerOn;
    }

    @Override
    public String toString() {
        return "Samochód\n\t" + super.toString() +
                "\n\t\t kilmatyzacja: " + airConditionerOn;
    }
}
