public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("BMW", "i8", 30000, 0.08, "1HGCM82633A123456", 4);
        Customer customer = new Customer("Ben Ten", "555-1234", "CUST1001", "Credit Card");
        SalesRepresentative salesRep = new SalesRepresentative("Park Yongjoon", "555-5678", "EMP2001", 0.05);
        
        customer.negotiatePrice(myCar);
        salesRep.finalizeTransaction(customer, myCar);
        
        Invoice invoice = new Invoice(customer, myCar, "INV-1001");
        invoice.printInvoice();
    }
}