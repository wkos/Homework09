package pl.wkos.homework91;

public class BasicAirConditioner extends AirConditioner {
    private double volumeCooling = 1;
    private double endTemperature;
    private double accuracy;

    public BasicAirConditioner(double endTemperature, double accuracy) {
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
