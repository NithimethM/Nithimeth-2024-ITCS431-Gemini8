class SalesRepresentative extends Person {
    private String employeeID;
    private double commissionRate;

    public SalesRepresentative(String name, String phoneNumber, String employeeID, double commissionRate) {
        super(name, phoneNumber);
        this.employeeID = employeeID;
        this.commissionRate = commissionRate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void finalizeTransaction(Customer customer, Vehicle vehicle) {
        System.out.println("Finalizing transaction for " + customer.getName() + " (Customer ID: " + customer.getCustomerID() + ", Phone: " + customer.getPhoneNumber() + ") and vehicle: ");
        vehicle.displayInfo();
        System.out.println("Sales Representative: " + name + " (Employee ID: " + employeeID + ", Commission Rate: " + commissionRate + ")");
    }
}