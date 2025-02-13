import java.util.Date;

public class SalesInvoice {
	
	private int InvoiceNumber;
	private Date date;
	private String Customerinfo;
	private DealerInstalledOption DealerInstalledOption;
	private float FinalNegotiatedPrice;
	private float Taxes;
	private float Licensefees;
	
	public SalesInvoice(int invoicenum, Date date, String Cusinfo, int optcode, String desc, float installprice, float price, float tax, float licensefee) {
		this.setInvoiceNumber(invoicenum);
		this.setDate(date);
		this.setCustomerinfo(Cusinfo);
		this.setDealerInstalledOption(new DealerInstalledOption(optcode, desc, installprice));
		this.setFinalNegotiatedPrice(price);
		this.setTaxes(tax);
		this.setLicensefees(licensefee);
	}

	public int getInvoiceNumber() {
		return InvoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		InvoiceNumber = invoiceNumber;
	}

	public String getCustomerinfo() {
		return Customerinfo;
	}

	public void setCustomerinfo(String customerinfo) {
		Customerinfo = customerinfo;
	}

	public DealerInstalledOption getDealerInstalledOption() {
		return this.DealerInstalledOption;
	}

	public void setDealerInstalledOption(DealerInstalledOption dealerInstalledOption2) {
		DealerInstalledOption = dealerInstalledOption2;
	}

	public float getFinalNegotiatedPrice() {
		return FinalNegotiatedPrice;
	}

	public void setFinalNegotiatedPrice(float finalNegotiatedPrice) {
		FinalNegotiatedPrice = finalNegotiatedPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getTaxes() {
		return Taxes;
	}

	public void setTaxes(float taxes) {
		Taxes = taxes;
	}

	public float getLicensefees() {
		return Licensefees;
	}

	public void setLicensefees(float licensefees) {
		Licensefees = licensefees;
	}
	
	
}
