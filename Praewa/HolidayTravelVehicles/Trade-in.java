public class TradeInVehicle extends Vehicle {
    
    private double tradeInValue; 
    private String condition;


    public TradeInVehicle(String name, String model, int year, String manufacturer, double baseCost, double tradeInValue, String condition) {
        super(name, model, year, manufacturer, baseCost); 
        this.tradeInValue = tradeInValue;
        this.condition = condition;
    }

    public double getTradeInValue() {
        return tradeInValue;
    }

    public void setTradeInValue(double tradeInValue) {
        this.tradeInValue = tradeInValue;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    // Display
    public void displayTradeInVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Trade-In Value: $" + tradeInValue);
        System.out.println("Condition: " + condition);
    }
}
