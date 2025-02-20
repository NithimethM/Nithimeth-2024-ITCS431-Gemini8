public class Vehicle {
    private String serial_number;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double cost;

    public Vehicle(String usr_serial_number, String usr_name, String usr_model, int usr_year, String usr_manufacturer, double usr_cost) {
        this.serial_number = usr_serial_number;
        this.name = usr_name;
        this.model = usr_model;
        this.year = usr_year;
        this.manufacturer = usr_manufacturer;
        this.cost = usr_cost;
    }

    public String getSerialNumber() {
        return this.serial_number;
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public double getCost() {
        return this.cost;
    }

    public void setSerialNumber(String new_serial_number) {
        this.serial_number = new_serial_number;
    }

    public void setName(String new_name) {
        this.name = new_name;
    }

    public void setModel(String new_model) {
        this.model = new_model;
    }

    public void setYear(int new_year) {
        this.year = new_year;
    }

    public void setManufacturer(String new_manufacturer) {
        this.manufacturer = new_manufacturer;
    }

    public void setCost(double new_cost) {
        this.cost = new_cost;
    }

    public String display() {
        return "Serial Number: "+this.serial_number+"\nName: "+this.name+"\nModel: "+this.model+"\nYear: "+this.year+"\nManufacturer: "+this.manufacturer+"\nCost: "+this.cost;
    }
}
