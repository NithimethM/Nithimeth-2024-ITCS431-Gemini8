public class SalesPerson extends Person{
    private static int SalesPersonID=0;
    private String Experiences;

    private SalesPerson(String name, String phoneNumber, String usr_experiences, int usr_SalesPersonID) {
        super(name, phoneNumber);
        this.Experiences = usr_experiences;
        SalesPerson.SalesPersonID=usr_SalesPersonID;
    }

    private SalesPerson(String name, String phoneNumber, String usr_experiences) {
        super(name, phoneNumber);
        this.Experiences = usr_experiences;
        ++SalesPerson.SalesPersonID;
    }

    public int getSalesPersonID() {
        return SalesPerson.SalesPersonID;
    }

    public String getExperiences() {
        return this.Experiences;
    }

    public void setSalesPersonID(int new_SalesPersonID) {
        SalesPerson.SalesPersonID = new_SalesPersonID;
    }

    public void setExperiences(String new_Experiences) {
        this.Experiences = new_Experiences;
    }

    public String display() {
        return "Sales Person ID: "+SalesPerson.SalesPersonID+"\n"+super.display()+"\nExperiences: "+this.Experiences;
    }

}
