public class Salesperson {
    private static int nextEmployeeID = 1;
    private int employeeID;
    private String fullName;
    

    public Salesperson(String fullName) {
        this.employeeID = nextEmployeeID++;
        this.fullName = fullName;
    }


    public int getEmployeeID() {
        return employeeID;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
