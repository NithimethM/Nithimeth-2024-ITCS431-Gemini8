public class Person {
    private String Name;
    private String PhoneNumber;

    public Person(String usr_Name, String usr_PhoneNumber) {
        this.Name = usr_Name;
        this.PhoneNumber = usr_PhoneNumber;
    }

    public String getName() {
        return this.Name;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setName(String new_Name) {
        this.Name = new_Name;
    }

    public void setPhoneNumber(String new_PhoneNumber) {
        this.PhoneNumber = new_PhoneNumber;
    }

    public String display() {
        return "Name: " + this.Name + "\nPhone Number: " + this.PhoneNumber;
    }
}