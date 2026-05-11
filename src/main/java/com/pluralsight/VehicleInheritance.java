package com.pluralsight;

public class VehicleInheritance {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setTopSpeed(30);
        slowRide.setFuelCapacity(6);
        slowRide.setNumberOfPassengers(2);

        Car dailyDriver = new Car();
        dailyDriver.setColor("Pink");
        dailyDriver.setNumberOfDoors(4);
        dailyDriver.setTopSpeed(210);

        SemiTruck peterbilt = new SemiTruck();
        peterbilt.setCargoCapacity(80000);
        peterbilt.setNumberOfPassengers(2);
        peterbilt.setNumberOfTrailers(1);

        Hovercraft hover = new Hovercraft();
        hover.setAirCushionPressure(10);
        hover.setTopSpeed(35);
        hover.setNumberOfPassengers(1);


        slowRide.startEngine();
        System.out.println(slowRide.getTopSpeed());
        System.out.println(slowRide.getNumberOfPassengers());

        System.out.println(dailyDriver.getColor());
    }
}
