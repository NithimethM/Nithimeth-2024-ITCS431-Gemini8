class Customer extends Person {
    private String customerID;
    private String preferredPaymentMethod;

    public Customer(String name, String phoneNumber, String customerID, String preferredPaymentMethod) {
        super(name, phoneNumber);
        this.customerID = customerID;
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

    public void negotiatePrice(Vehicle vehicle) {
        System.out.println(name + " (Customer ID: " + customerID + ", Phone: " + phoneNumber + ") is negotiating price for: ");
        vehicle.displayInfo();
    }
}