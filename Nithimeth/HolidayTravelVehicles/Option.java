
public class Option {

    private String optionCode;
    private String description;
    private double price;

    public Option(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

    public String getOptionCode() {
        return optionCode;
    }

    public void setOptionCode(String _opt) {
        this.optionCode = _opt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String _desc) {
        this.description = _desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double _price) {
        this.price = _price;
    }
}
