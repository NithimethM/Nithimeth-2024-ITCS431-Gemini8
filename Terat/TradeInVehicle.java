public class TradeInVehicle extends Vehicle{
    private int miles;

    public TradeInVehicle(String serialNumber, String name, String model, int year, String manufacturer, double cost, int miles) {
        super(serialNumber, name, model, year, manufacturer, cost);
        this.miles = miles;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String display() {
        return super.display() + "\nMiles: " + this.miles;
    }
}
