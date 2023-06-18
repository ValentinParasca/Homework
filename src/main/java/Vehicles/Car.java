package Vehicles;

abstract class Car implements Vehicle {
    protected final float fuelTankSize;
    protected final String fuelType;
    protected final int gears;
    protected float consumptionPer100Km;
    protected float availableFuel;
    protected int tireSize;
    protected String chassisNumber;
    protected float totalFuelConsumed;
    protected int currentGear;
    private static final float GEAR_SHIFT_CONSUMPTION_DECREASE = 0.1f;
    private static final float TIRE_SIZE_CONSUMPTION_INCREASE = 0.05f;

    public Car(float fuelTankSize, String fuelType, int gears, float consumptionPer100Km) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
        this.availableFuel = 0;
        this.tireSize = 0;
        this.chassisNumber = "";
        this.totalFuelConsumed = 0;
        this.currentGear = 0;
    }

    public void setAvailableFuel(float availableFuel) {
        this.availableFuel = availableFuel;
    }

    public void setTireSize(float tireSize) {
        this.tireSize = (int) tireSize;
        consumptionPer100Km *= (1 + (tireSize - 15) * TIRE_SIZE_CONSUMPTION_INCREASE);
    }


    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    @Override
    public void start() {
        totalFuelConsumed = 0;
        currentGear = 1;
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void drive(double kilometers) {
        if (currentGear == 0) {
            System.out.println("Please shift to a valid gear.");
            return;
        }

        double fuelConsumed = calculateFuelConsumption(kilometers);
        if (fuelConsumed <= availableFuel) {
            totalFuelConsumed += fuelConsumed;
            availableFuel -= fuelConsumed;
            System.out.println("Car driven for " + kilometers + " km.");
        }else {
            System.out.println("Insufficient fuel to complete the drive.");
        }
    }

    private double calculateFuelConsumption(double kilometers) {
        double consumptionPerKm = totalFuelConsumed / kilometers;
        //consumptionPer100Km * (tireSize / 15.0)

        for (int gear = 1; gear < currentGear; gear++) {
            consumptionPerKm += (consumptionPer100Km * (gear - 1) * 0.02);
        }

        consumptionPerKm += (consumptionPer100Km * (tireSize - 15) * 0.01);

        return consumptionPerKm * kilometers;
    }

    public void shiftGear(int gear) {
        if (gear >= 1 && gear <= gears) {
            currentGear = gear;
            // Adjust consumption based on gear shifting
            consumptionPer100Km *= (1 - GEAR_SHIFT_CONSUMPTION_DECREASE);
        }
    }

    public float getAvailableFuel() {
        return availableFuel;
    }

    public float getAverageFuelConsumption() {
        if (totalFuelConsumed == 0) {
            return 0;
        }else{
            return (totalFuelConsumed / (float) (gears * 100)) * 100;}
    }
}