public class DealerInstalledOption {
    private int Option_code;
    private String Description;
    private double Price;

    public DealerInstalledOption(int optionCode, String description, double price) {
        this.Option_code = optionCode;
        this.Description = description;
        this.Price = price;
    }

    public int getOption_code() {
        return Option_code;
    }

    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return Price;
    }

    public void setOption_code(int option_code) {
        this.Option_code = option_code;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public String display(){
        return "Option Code: " + Option_code + "\nDescription: " + Description + "\nPrice: " + Price;
    }
}