package pl.wkos.homework91;

public class Room {
    private int id;
    private double currentTemperature;
    private int cubature;
    private AirConditioner airConditioner;

    public Room(int id, double currentTemperature, int cubature, AirConditioner airConditioner) {
        this.id = id;
        this.currentTemperature = currentTemperature;
        this.cubature = cubature;
        this.airConditioner = airConditioner;
    }

    public void cooling() {
        if (Math.abs(currentTemperature - airConditioner.getEndTemperature()) <= airConditioner.getAccuracy()) {
            showCurrentTemperature();
        } else {
            if (airConditioner.isAirConditionerOn()) {
                while (Math.abs(currentTemperature - airConditioner.getEndTemperature()) > airConditioner.getAccuracy()) {
                    changeTemperature();
                    showCurrentTemperature();
                }
            } else {
                System.out.println("Musisz włączyć klimatyzator");
            }
        }
    }

    public void changeTemperature() {
        currentTemperature -= airConditioner.getVolumeCooling() / cubature;
    }

    public void showCurrentTemperature() {
        System.out.printf("%5.2f; ", currentTemperature);
    }
}
