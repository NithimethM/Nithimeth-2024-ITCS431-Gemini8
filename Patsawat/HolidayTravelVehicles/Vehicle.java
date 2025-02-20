public class Vehicle {
    private String make;
    private String model;
    private double price;
    private double taxRate;
    private String vin;

    public Vehicle(String make, String model, double price, double taxRate, String vin) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.taxRate = taxRate;
        this.vin = vin;
    }

    public double calculateFinalPrice() {
        return price + (price * taxRate);
    }

    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", VIN: " + vin + ", Base Price: $" + price + ", Final Price: $" + calculateFinalPrice());
    }
}