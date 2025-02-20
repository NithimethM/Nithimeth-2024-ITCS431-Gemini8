
public class Vehicle {
    
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private float baseCost;
    private SoldStatus status;

    public enum SoldStatus {
        NOT_SOLD,
        PENDING,
        SOLD
    }

    public Vehicle(String serialno, String name, String model, int year, String manufac, float baseCost, SoldStatus status) {
        this.serialNumber = serialno;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufac;
        this.baseCost = baseCost;
        this.status = status;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(float baseCost) {
        this.baseCost = baseCost;
    }

    public SoldStatus getStatus() {
        return status;
    }

    public void setStatus(SoldStatus status) {
        this.status = status;
    }
    
    public void displayVehicleInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Serial Number: " + this.serialNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Base Cost: $" + this.baseCost);
        System.out.println("Sold Status: " + this.status);
    }


}
