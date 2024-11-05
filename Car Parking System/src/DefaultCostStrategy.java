public class DefaultCostStrategy implements CostStrategy {
    @Override
    public double calculateCost(VehicleType vehicleType, int hours) {
        switch (vehicleType) {
            case CAR:
                return hours * 20.0;
            case BIKE:
                return hours * 10.0;
            case TRUCK, BUS:
                return hours * 30.0;
            default:
                return 0;
        }
    }
}
