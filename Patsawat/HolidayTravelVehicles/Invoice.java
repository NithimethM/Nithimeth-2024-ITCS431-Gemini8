class Invoice {
    private Customer customer;
    private Vehicle vehicle;
    private double finalPrice;
    private String invoiceNumber;

    public Invoice(Customer customer, Vehicle vehicle, String invoiceNumber) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.finalPrice = vehicle.calculateFinalPrice();
        this.invoiceNumber = invoiceNumber;
    }

    public void printInvoice() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Invoice for " + customer.getName() + " (Customer ID: " + customer.getCustomerID() + ", Phone: " + customer.getPhoneNumber() + ")");
        vehicle.displayInfo();
        System.out.println("Total Amount Due: $" + finalPrice);
    }
}