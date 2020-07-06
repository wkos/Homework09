package pl.wkos.homework91;

public class Room {
    private int id;
    private double currentTemperature;
    private int cubature;

    public Room(int id, double currentTemperature, int cubature) {
        this.id = id;
        this.currentTemperature = currentTemperature;
        this.cubature = cubature;
    }

    public void showCurrentTemperature() {
        System.out.printf("%5.2f; ", currentTemperature);
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getCubature() {
        return cubature;
    }
}
