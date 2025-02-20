public class Vehicle {

    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String _serialNumber){
        this.serialNumber = _serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String _model) {
        this.model = _model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int _year) {
        this.year = _year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String _manufacturer) {
        this.manufacturer = _manufacturer;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double _cost) {
        this.baseCost = _cost;
    }

    public void displayInfo() {
        System.out.println("Vehicle Info: " 
        + "\nSerial Number: " + serialNumber
        + "\nName: " + name 
        + "\nModel: " + model 
        + "\nYear: " + year
        + "\nManufacturer: " + manufacturer
        + "\nBaseCost: " + baseCost);
    }
}