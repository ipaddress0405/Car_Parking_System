public class ParkingManager {
    private ParkingLot parkingLot;
    private CostStrategy costStrategy;

    public ParkingManager(ParkingLot parkingLot, CostStrategy costStrategy) {
        this.parkingLot = parkingLot;
        this.costStrategy = costStrategy;
    }

    public boolean addVehicleToParking(Vehicle vehicle, int floor) {
        return parkingLot.parkVehicle(floor, vehicle);
    }

    public boolean removeVehicleFromParking(int floor, int slotNumber) {
        return parkingLot.removeVehicle(floor, slotNumber);
    }

    public boolean checkSpaceAvailability(int floor, VehicleType vehicleType) {
        return parkingLot.isSpaceAvailable(floor, vehicleType);
    }

    public void displayParkingStatus() {
        parkingLot.displayParkingStatus();
    }

    public double calculateParkingCost(VehicleType vehicleType, int hours) {
        return costStrategy.calculateCost(vehicleType, hours);
    }
}
