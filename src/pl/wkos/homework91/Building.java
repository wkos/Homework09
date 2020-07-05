package pl.wkos.homework91;

public class Building {
    public static void main(String[] args) {
        AirConditioner airConditioner1 = new BasicAirConditioner(25, 0.05);
        AirConditioner airConditioner2 = new ProAirConditioner(25, 0.05);
        Room room1 = new Room(1, 27, 10, airConditioner1);
        Room room2 = new Room(2, 27, 10, airConditioner2);
        airConditioner1.on();
        room1.cooling();
        System.out.println("\n------------------------------------------------");
        airConditioner2.on();
        room2.cooling();
        System.out.println("\n------------------------------------------------");
        airConditioner1.off();
        room1.cooling();
        System.out.println("\n------------------------------------------------");
        airConditioner2.off();
        room2.cooling();
        System.out.println("\n------------------------------------------------");
        AirConditioner airConditioner3 = new BasicAirConditioner(25, 0.05);
        AirConditioner airConditioner4 = new ProAirConditioner(25, 0.05);
        Room room3 = new Room(1, 24, 10, airConditioner1);
        Room room4 = new Room(2, 24, 10, airConditioner2);
        airConditioner3.on();
        room3.cooling();
        System.out.println("\n------------------------------------------------");
        airConditioner4.on();
        room4.cooling();
        System.out.println("\n------------------------------------------------");
        airConditioner3.off();
        room3.cooling();
        System.out.println("\n------------------------------------------------");
        airConditioner4.off();
        room4.cooling();
    }
}
