public class Customer extends Person{
    private static int CustomerID=0;
    private String Address;

    public Customer(String name, String PhoneNumber, String usr_Addr, int CustomerID) {
        super(name, PhoneNumber);
        this.Address = "Unknown";
        Customer.CustomerID=CustomerID;
    }

    public Customer(String name, String PhoneNumber, String usr_Addr) {
        super(name, PhoneNumber);
        this.Address = usr_Addr;
        ++CustomerID;
    }

    public int getCustomerID(){
        return Customer.CustomerID;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setCustomerID(int new_CustomerID) {
        Customer.CustomerID = new_CustomerID;
    }

    public void setAddress(String new_Addr) {
        this.Address = new_Addr;
    }

    public String display() {
        return "Customer ID: "+Customer.CustomerID+"\n"+super.display()+"\nAddress: "+this.Address;
    }
}