class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, double price, double taxRate, String vin, int numberOfDoors) {
        super(make, model, price, taxRate, vin);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numberOfDoors);
    }
}
