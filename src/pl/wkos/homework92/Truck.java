package pl.wkos.homework92;

public class Truck extends Car {
    private double loadWeight;

    public Truck(String name, int fuelTankCapacity, double averageMileage,
                 boolean airConditionerOn, double loadWeight) {
        super(name, fuelTankCapacity, averageMileage, airConditionerOn);
        this.loadWeight = loadWeight;
    }

    @Override
    public double getDistanceRadius() {
        return getFuelTankCapacity()/getAverageMileage()*100;
    }

    public void setAirConditionerOn(boolean airConditionerOn) {
        super.setAirConditionerOn(airConditionerOn);
    }

    @Override
    public double getAverageMileage() {
        double increaseMileageByWeight = super.getAverageMileage() + 0.5 * (int) (loadWeight / 100);
        if (super.isAirConditionerOn())
            return increaseMileageByWeight + 0.8;
        else
            return increaseMileageByWeight;
    }

    @Override
    public String toString() {
        return "Ciężarówka: " + super.toString() + " ładunek: " + loadWeight + "kg";
    }
}
