package Vehicles;
public class Main {
    public static void main(String[] args) {
        Car car1 = new VWGolf(50, "Petrol", 6, 5.5f);
        car1.setAvailableFuel(25);
        car1.setTireSize(15);
        car1.setChassisNumber("ABC123");
        car1.start();
        car1.shiftGear(1);
        car1.drive(10);
        car1.shiftGear(2);
        car1.drive(20);
        car1.shiftGear(3);
        car1.drive(30);
        car1.stop();
        System.out.println("Available fuel: " + car1.getAvailableFuel() + " liters");
        System.out.println("Average fuel consumption: " + car1.getAverageFuelConsumption() + " liters/100km");

        Car car2 = new VWPassat(60, "Diesel", 6, 6.2f);
        car2.setAvailableFuel(50);
        car2.setTireSize(16);
        car2.setChassisNumber("DEF456");
        car2.start();
        car2.shiftGear(1);
        car2.drive(15);
        car2.shiftGear(2);
        car2.drive(25);
        car2.shiftGear(3);
        car2.drive(35);
        car2.stop();
        System.out.println("Available fuel: " + car2.getAvailableFuel() + " liters");
        System.out.println("Average fuel consumption: " + car2.getAverageFuelConsumption() + " liters/100km");

    }
}