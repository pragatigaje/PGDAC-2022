package dec20;

class Employee{
	private int empId;
	private String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId + " " + empName;
	}
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "ram");
		System.out.println(emp); 
	}

}
