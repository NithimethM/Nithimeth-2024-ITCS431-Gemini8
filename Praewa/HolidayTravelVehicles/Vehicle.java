public class Vehicle {

    private static int nextSerialNumber = 1; 
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost = 0.00; 


    public Vehicle(String name, String model, int year, String manufacturer, double baseCost) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
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

    public void setManufacturer(String manufacturer)
    public void displayVehicleInfo() {
        System.out.println("Vehicle Details:");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.printf("Base Cost: $%.2f%n", baseCost);
    }
}
