public class Customer {
	
	private int CustomerID = 0;
	private String Fullname;
	private String Address;
	private String PhoneNumber;
	
	public Customer(String Fullname, String Address, String Phonenum) {
		this.setCustomerID(runningID++);
		this.setFullname(Fullname);
		this.setAddress(Address);
		this.setPhoneNumber(Phonenum);
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
}