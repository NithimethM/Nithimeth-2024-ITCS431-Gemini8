
public class DealerInstalledOption {

	private int OptionCode;
	private String Description;
	private float price;
	
	public DealerInstalledOption(int optcode, String desc, float price) {
		this.setOptionCode(optcode);
		this.setDescription(desc);
		this.setPrice(price);
	}

	public int getOptionCode() {
		return OptionCode;
	}

	public void setOptionCode(int optionCode) {
		this.OptionCode = optionCode;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}