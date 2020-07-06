package pl.wkos.homework91;

public class ProAirConditioner extends AirConditioner {
    private final double VOLUMECOOLING = 2;

    public ProAirConditioner(double endTemperature, double accuracy, Room room) {
        super(endTemperature, accuracy, room);
    }

    public void changeTemperature() {
        room.setCurrentTemperature(room.getCurrentTemperature() - VOLUMECOOLING / room.getCubature());
    }

    public double getVolumeCooling() {
        return VOLUMECOOLING;
    }
}
