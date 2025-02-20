public class Customer {
	
    private static int nextCustomerID = 1;  // Static variable for customer ID generation
    private int customerID;
    private String fullname;
    private String address;
    private String phoneNumber;
	
    public Customer(String fullname, String address, String phoneNumber) {
        this.customerID = nextCustomerID++;
        this.setFullname(fullname);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getFullName() {
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
