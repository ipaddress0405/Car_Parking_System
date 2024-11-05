public class ParkingSpot {
    private int spotNumber;
    private Vehicle vehicle;

    public ParkingSpot(int spotNumber, Vehicle vehicle) {
        this.spotNumber = spotNumber;
        this.vehicle = vehicle;
    }

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = this.vehicle;
    }

    public void removeVehicle(){
        vehicle = null;
    }

    public boolean isOccupied() {
        return vehicle != null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


}
