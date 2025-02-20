
public class Salesperson {

	private static int runningID = 1;
	private String name;
	private int employeeID;
	
	public Salesperson(String name) {
		this.setName(name);
		this.setEmployeeID(runningID++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
}
