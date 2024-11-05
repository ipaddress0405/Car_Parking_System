public class CurrencyCostStrategy implements CostStrategy {
    private String currency;

    public CurrencyCostStrategy(String currency) {
        this.currency = currency;
    }

    @Override
    public double calculateCost(VehicleType vehicleType, int hours) {
        double baseCost = new DefaultCostStrategy().calculateCost(vehicleType, hours);
        switch (currency) {
            case "USD":
                return baseCost;
            case "EUR":
                return baseCost * 0.85;
            default:
                return baseCost;
        }
    }
}
