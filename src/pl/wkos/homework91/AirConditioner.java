package pl.wkos.homework91;

public class AirConditioner {
    private boolean airConditionerOn;

    public AirConditioner() {
        this.airConditionerOn = false;
    }

    public void on() {
        this.airConditionerOn = true;
    }

    public void off() {
        this.airConditionerOn = false;
    }

    public boolean isAirConditionerOn() {
        return airConditionerOn;
    }

    public double getVolumeCooling() {
        return 0;
    }

    public double getEndTemperature() {
        return 0;
    }

    public double getAccuracy() {
        return 0;
    }
}
