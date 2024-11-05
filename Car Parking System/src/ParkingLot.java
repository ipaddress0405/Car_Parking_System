import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private int floors;
    private int slotsPerfloor;
    private List<List<ParkingSpot>>parkingSpaces;

    public ParkingLot(int floors, int slotsPerfloor) {
        this.floors = floors;
        this.slotsPerfloor = slotsPerfloor;
        this.parkingSpaces = new ArrayList<>();

        for (int i = 0; i < floors; i++) {
            ArrayList<ParkingSpot> floorSpaces  = new ArrayList<>();
            for (int j = 0; i < slotsPerfloor; i++) {
                floorSpaces.add(new ParkingSpot(j + 1));
            }
            parkingSpaces.add(floorSpaces);
        }
    }


    public boolean parkVehicle(int floor, Vehicle vehicle) {
        List<ParkingSpot> spaces = parkingSpaces.get(floor);
        for (ParkingSpot spot : spaces) {
            if (!spot.isOccupied()) {
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean removeVehicle(int floor, int slotNumber) {
        List<ParkingSpot> spaces = parkingSpaces.get(floor);
        for (ParkingSpot space : spaces) {
            if (space.getSpotNumber() == slotNumber && space.isOccupied()) {
                space.removeVehicle();
                return true;
            }
        }
        return false; // Slot not found or already empty
    }

    public boolean isSpaceAvailable(int floor, VehicleType vehicleType) {
        List<ParkingSpot> spaces = parkingSpaces.get(floor);
        for (ParkingSpot space : spaces) {
            if (!space.isOccupied()) {
                return true;
            }
        }
        return false; // No available space
    }

    public void displayParkingStatus() {
        for (int i = 0; i < parkingSpaces.size(); i++) {
            System.out.println("Floor " + (i + 1) + ":");
            for (ParkingSpot space : parkingSpaces.get(i)) {
                System.out.println(space);
            }
        }
    }




}
