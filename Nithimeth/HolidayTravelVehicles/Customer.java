public class Customer {
    
    private static int runningID = 1;
    private int customerID;
    private String fullname;
    private String address;
    private String phoneNumber;

    public Customer(String fullname, String address, String phoneNumber) {
        this.customerID = runningID++;
        this.fullname = fullname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}