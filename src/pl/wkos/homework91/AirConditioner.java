package pl.wkos.homework91;

public class AirConditioner {
    private boolean airConditionerOn;
    private double endTemperature;
    private double accuracy;
    Room room;

    public AirConditioner(double endTemperature, double accuracy, Room room) {
        this.airConditionerOn = false;
        this.endTemperature = endTemperature;
        this.accuracy = accuracy;
        this.room = room;
    }

    public void cooling() {
        if (Math.abs(room.getCurrentTemperature() - endTemperature) <= getAccuracy()) {
            room.showCurrentTemperature();
        } else {
            if (room.getCurrentTemperature() < endTemperature) {
                System.out.println("Temepratura niższa niż oczekiwana. Wyłączam klimatyzator");
                off();
            } else {
                if (isAirConditionerOn()) {
                    while (Math.abs(room.getCurrentTemperature() - endTemperature) > accuracy) {
                        changeTemperature();
                        room.showCurrentTemperature();
                    }
                } else {
                    System.out.println("Musisz włączyć klimatyzator");
                }
            }
        }
    }

    public void on() {
        this.airConditionerOn = true;
    }

    public void off() {
        this.airConditionerOn = false;
    }

    public void changeTemperature() {
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
