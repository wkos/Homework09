package pl.wkos.homework91;

public class Building {
    public static void main(String[] args) {
        Room[] rooms = new Room[4];
        rooms[0] = new Room(1, 27, 10);
        rooms[1] = new Room(2, 27, 10);
        rooms[2] = new Room(3, 24, 10);
        rooms[3] = new Room(4, 24, 10);

        AirConditioner[] airConditioners = new AirConditioner[4];
        airConditioners[0] = new BasicAirConditioner(25, 0.05, rooms[0]);
        airConditioners[1] = new ProAirConditioner(25, 0.05, rooms[1]);
        airConditioners[2] = new BasicAirConditioner(25, 0.05, rooms[2]);
        airConditioners[3] = new ProAirConditioner(25, 0.05, rooms[3]);

        for (int i = 0; i < 4; i++) {
            airConditioners[i].on();
            airConditioners[i].cooling();
            System.out.println("\n------------------------------------------------");
        }

        rooms[0].setCurrentTemperature(27);
        rooms[1].setCurrentTemperature(27);
        rooms[2].setCurrentTemperature(24);
        rooms[3].setCurrentTemperature(24);

        for (int i = 0; i < 4; i++) {
            airConditioners[i].off();
            airConditioners[i].cooling();
            System.out.println("\n------------------------------------------------");
        }
    }
}
