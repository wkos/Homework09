package pl.wkos.homework91;

public class BasicAirConditioner extends AirConditioner {
    private final double VOLUMECOOLING = 1;

    public BasicAirConditioner(double endTemperature, double accuracy, Room room) {
        super(endTemperature, accuracy, room);
    }

    public void changeTemperature() {
        room.setCurrentTemperature(room.getCurrentTemperature() - VOLUMECOOLING / room.getCubature());
    }

    public double getVolumeCooling() {
        return VOLUMECOOLING;
    }
}
