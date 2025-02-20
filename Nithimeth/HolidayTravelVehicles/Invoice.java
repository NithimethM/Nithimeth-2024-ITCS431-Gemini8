import java.util.Date;

public class Invoice {

    private int invoiceNumber;
    private Date date;
    private Customer customer;
    private double tradeInAllowance;
    private double finalPrice;

    public Invoice(int invoiceNumber, Date date,Customer customer, double tradeInAllowance, double finalPrice) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.customer = customer;
        this.tradeInAllowance = tradeInAllowance;
        this.finalPrice = finalPrice;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int _invoiceNumber){
        this.invoiceNumber = _invoiceNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date _date) {
        this.date = _date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTradeInAllowance() {
        return tradeInAllowance;
    }

    public void setTradeInAllowance(double _allowance) {
        this.tradeInAllowance = _allowance;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double _finalPrice) {
        this.finalPrice = _finalPrice;
    }
}