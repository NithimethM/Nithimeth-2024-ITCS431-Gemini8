public class Salesperson {
    
    private int employeeID;
    private String name;
    private int salesCount;

    public Salesperson(int employeeID, String name, int salesCount) {
        this.employeeID = employeeID;
        this.name = name;
        this.salesCount = salesCount;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int _ID) {
        this.employeeID = _ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public int getSalesCount() {
        return salesCount;
    }


    public void setSalesCount(int _salesCount) {
        this.salesCount = _salesCount;
    }
}
