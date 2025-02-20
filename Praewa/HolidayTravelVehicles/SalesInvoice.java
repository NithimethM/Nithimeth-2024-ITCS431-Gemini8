import java.util.Date;

public class SalesInvoice {

    private int invoiceNumber;
    private Date date;
    private Customer customer; // Changed to Customer class
    private Salesperson salesperson; // Changed to Salesperson class
    private DealerInstalledOption dealerInstalledOption;
    private double finalNegotiatedPrice;
    private double taxes;
    private double licenseFees;

    // Constructor
    public SalesInvoice(int invoiceNumber, Date date, Customer customer, Salesperson salesperson, 
                        DealerInstalledOption dealerInstalledOption, double finalNegotiatedPrice, 
                        double taxes, double licenseFees) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.customer = customer;
        this.salesperson = salesperson;
        this.dealerInstalledOption = dealerInstalledOption;
        this.finalNegotiatedPrice = finalNegotiatedPrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
    }

    // Getters and Setters
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Salesperson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(Salesperson salesperson) {
        this.salesperson = salesperson;
    }

    public DealerInstalledOption getDealerInstalledOption() {
        return dealerInstalledOption;
    }

    public void setDealerInstalledOption(DealerInstalledOption dealerInstalledOption) {
        this.dealerInstalledOption = dealerInstalledOption;
    }

    public double getFinalNegotiatedPrice() {
        return finalNegotiatedPrice;
    }

    public void setFinalNegotiatedPrice(double finalNegotiatedPrice) {
        this.finalNegotiatedPrice = finalNegotiatedPrice;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getLicenseFees() {
        return licenseFees;
    }

    public void setLicenseFees(double licenseFees) {
        this.licenseFees = licenseFees;
    }

    // Display Invoice Details
    public void displayInvoice() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Date: " + date);
        System.out.println("Customer: " + customer.getFullName());
        System.out.println("Salesperson: " + salesperson.getFullName());
        if ( dealerInstalledOption != null) {
            System.out.println("Dealer Installed Option: " + dealerInstalledOption.getDescription());
        }
        System.out.printf("Final Negotiated Price: $%.2f%n", finalNegotiatedPrice);
        System.out.printf("Taxes: $%.2f%n", taxes);
        System.out.printf("License Fees: $%.2f%n", licenseFees);
    }
}
