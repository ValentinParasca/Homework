package Vehicles;
public class Main {
    public static void main(String[] args) {
        Car car1 = new VWGolf(50, "Petrol", 6, 5.5f);
        car1.setAvailableFuel(25);
//        car1.setTireSize(15);
//        car1.setChassisNumber("ABC123");
        car1.start();
//        car1.shiftGear(1);
        car1.drive(10);
//        car1.shiftGear(2);
//        car1.drive(20);
//        car1.shiftGear(3);
//        car1.drive(30);
//        car1.stop();
        System.out.println("Available fuel: " + car1.getAvailableFuel() + " liters");
        System.out.println("Average fuel consumption: " + car1.getAverageFuelConsumption() + " liters/100km");

//        Car car2 = new VWPassat(60, "Diesel", 6, 6.2f);
//        car2.setAvailableFuel(50);
//        car2.setTireSize(16);
//        car2.setChassisNumber("DEF456");
//        car2.start();
//        car2.shiftGear(1);
//        car2.drive(15);
//        car2.shiftGear(2);
//        car2.drive(25);
//        car2.shiftGear(3);
//        car2.drive(35);
//        car2.stop();
//        System.out.println("Available fuel: " + car2.getAvailableFuel() + " liters");
//        System.out.println("Average fuel consumption: " + car2.getAverageFuelConsumption() + " liters/100km");
//
//        Car car3 = new MercCklasse(70, "Petrol", 7, 7.0f);
//        car3.setAvailableFuel(52);
//        car3.setTireSize(18);
//        car3.setChassisNumber("GHI789");
//        car3.start();
//        car3.shiftGear(1);
//        car3.drive(20);
//        car3.shiftGear(2);
//        car3.drive(40);
//        car3.shiftGear(3);
//        car3.drive(60);
//        car3.stop();
//        System.out.println("Available fuel: " + car3.getAvailableFuel() + " liters");
//        System.out.println("Average fuel consumption: " + car3.getAverageFuelConsumption() + " liters/100km");
//
//        Car car4 = new MercSklasse(80, "Petrol", 7, 8.0f);
//        car4.setAvailableFuel(65);
//        car4.setTireSize(19);
//        car4.setChassisNumber("JKL012");
//        car4.start();
//        car4.shiftGear(1);
//        car4.drive(25);
//        car4.shiftGear(2);
//        car4.drive(50);
//        car4.shiftGear(3);
//        car4.drive(75);
//        car4.stop();
//        System.out.println("Available fuel: " + car4.getAvailableFuel() + " liters");
//        System.out.println("Average fuel consumption: " + car4.getAverageFuelConsumption() + " liters/100km");
   }
}