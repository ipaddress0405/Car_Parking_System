public class Main {
    public static void main(String[] args) {
        //Initialize the parkinglot with total number of floor and number of slots per floor.
        ParkingLot parkingLot = new ParkingLot(3,5);

        CostStrategy costStrategy = new CurrencyCostStrategy("USD");

       ParkingManager parkingManager= new ParkingManager(parkingLot,costStrategy);

        //add the vehicle
        Vehicle car1 = new Car("ABC123");
        Vehicle truck1 = new Truck("XYZ456");

        parkingManager.addVehicleToParking(car1,0);
        parkingManager.addVehicleToParking(truck1,0);

        // Display the current status of the parking lot
        parkingManager.displayParkingStatus();

        // Check availability on a specific floor for Cars
        System.out.println("Is space available on floor 1 for Car: " +
                parkingManager.checkSpaceAvailability(0, VehicleType.CAR));

        // Calculate the cost for parking
        System.out.println("Cost for parking Car for 3 hours: " +
                parkingManager.calculateParkingCost(VehicleType.CAR, 3));

    }
}
