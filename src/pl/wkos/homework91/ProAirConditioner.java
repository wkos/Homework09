package pl.wkos.homework91;

public class ProAirConditioner extends AirConditioner {
    private double volumeCooling = 2;
    private double endTemperature;
    private double accuracy;

    public ProAirConditioner(double endTemperature, double accuracy) {
        super();
        this.endTemperature = endTemperature;
        this.accuracy = accuracy;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public double getVolumeCooling() {
        return volumeCooling;
    }

    public double getEndTemperature() {
        return endTemperature;
    }
}
