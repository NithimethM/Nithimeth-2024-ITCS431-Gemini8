import java.util.Date;

public class Invoice {
    private int InvoiceNumber;
    private Date date;
    private Customer Customer;
    private SalesPerson Sales_person;
    private Vehicle Purchased_vehicle;
    private TradeInVehicle Trade_in_vehicle;
    private DealerInstalledOption Dealer_install;
    private double Final_price;
    private double Tax=0.07;

    public Invoice(int invoiceNumber, Date date, Customer customer, SalesPerson salesPerson, Vehicle purchasedVehicle, TradeInVehicle tradeInVehicle, int optcode, String desc, double installprice) {
        this.InvoiceNumber = invoiceNumber;
        this.date = date;
        this.Customer = customer;
        this.Sales_person = salesPerson;
        this.Purchased_vehicle = purchasedVehicle;
        this.Trade_in_vehicle = tradeInVehicle;
        this.Dealer_install = new DealerInstalledOption(optcode, desc, installprice);
    }

    public int getInvoiceNumber() {
        return this.InvoiceNumber;
    }

    public String getCustomer(){
        return this.Customer.display();
    }

    public String getSalesPerson(){
        return this.Sales_person.display();
    }

    public DealerInstalledOption getDealerInstalledOption() {
        return this.Dealer_install;
    }

    public double getFinalPrice() {
        return this.Final_price;
    }

    public Date getDate() {
        return this.date;
    }

    public double getTax() {
        return this.Tax;
    }

    public void setInvoiceNumber(int new_invoiceNumber) {
        this.InvoiceNumber = new_invoiceNumber;
    }

    public void setCustomer(Customer new_customer) {
        this.Customer = new_customer;
    }

    public void setSalesPerson(SalesPerson new_sales_person) {
        this.Sales_person = new_sales_person;
    }

    public void setDealerInstalledOption(DealerInstalledOption new_dealer_install) {
        this.Dealer_install = new_dealer_install;
    }

    public void setFinalPrice(double new_final_price) {
        this.Final_price = new_final_price;
    }

    public void setDate(Date new_date) {
        this.date = new_date;
    }

    public void setTax(double new_tax) {
        this.Tax = new_tax;
    }



    public double calFinalPrice(){
        double purchased = this.Purchased_vehicle.getCost();
        double totalPrice = purchased + this.Dealer_install.getPrice() - this.Trade_in_vehicle.getCost();
        return totalPrice+(totalPrice*this.Tax);
    }
}
