package pl.wkos.homework92;

public class VehicleTest {
    public static void main(String[] args) {
        boolean airConditionerOn = true;
        boolean airConditionerOff = false;
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("Fiat Panda", 25, 5, airConditionerOff);
        vehicles[1] = new Car("Fiat Bravo", 35, 7, airConditionerOff);
        vehicles[2] = new Truck("MAN", 250, 25, airConditionerOff,
                1534);
        vehicles[3] = new Truck("DAF", 450, 45, airConditionerOff,
                2534);

        System.out.println("Klimatyzacja wyłączona");
        for (int i = 0; i < 4; i++) {
            System.out.print(vehicles[i].toString());
            System.out.printf("\n\t\t\tZasięg: %6.2f\n", vehicles[i].getDistanceRadius());
        }

        for (int i = 0; i < 4; i++) {
            vehicles[i].setAirConditionerOn(airConditionerOn);
        }

        System.out.println("Klimatyzacja włączona");
        for (int i = 0; i < 4; i++) {
            System.out.print(vehicles[i].toString());
            System.out.printf("\n\t\t\tZasięg: %6.2f\n", vehicles[i].getDistanceRadius());
        }
    }
}
