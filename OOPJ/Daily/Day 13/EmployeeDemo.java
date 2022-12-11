abstract class Employee
{
	private int empId;
	private String name;
	double salary;
	abstract double getSalary();
	abstract void printDetails();
	
	void setEmpId(int empId)
	{
		this.empId=empId;
	}
	Employee()
	{}
	
	int getEmpId()
	{
		return empId;
	}
	
}

class RegularEmployee extends Employee
{
	double basicPay;
	
	
	RegularEmployee()
	{}
	RegularEmployee(int empId, String name, double basicPay)
	{
		setEmpId(empId);
		this.name=name;
		this.basicPay=basicPay;
	}
	
	double getSalary()
	{
		salary = basicPay*1.7;
		return salary;
	}
	
	void printDetails()
	{
		System.out.println("Employee Type : Regular Employee");
		System.out.println("Employee Id : "+getEmpId());
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+getSalary());
		System.out.println("-------------------------------------");
	}
	
}

abstract class ContractBasedEmployee extends Employee
{
	int noOfYears;
}

class CdacEmployee extends ContractBasedEmployee
{
	double consolidatedSalary;
	CdacEmployee()
	{}
	CdacEmployee(int empId, String name, int noOfYears, double consolidatedSalary)
	{
		setEmpId(empId);
		this.name = name;
		this.noOfYears = noOfYears;
		this.consolidatedSalary = consolidatedSalary;
	}
	double getSalary()
	{
		salary=consolidatedSalary;
		return salary;
	}
	
	void printDetails()
	{
		System.out.println("Employee Type : CDAC ContractBased Employee");
		System.out.println("Employee Id : "+getEmpId());
		System.out.println("Employee Name : "+name);
		System.out.println("Employee service years : "+noOfYears);
		System.out.println("Employee Salary : "+getSalary());
		System.out.println("-------------------------------------");
	}

}

class ThirdPartyEmployee extends ContractBasedEmployee
{
	// int empId= 0;
	ThirdPartyEmployee()
	{}
	ThirdPartyEmployee(int empId, String name, int noOfYears, double salary)
	{
		setEmpId(empId);
		this.name = name;
		this.noOfYears = noOfYears;
		this.salary = salary;
	}
	double getSalary()
	{
		return salary;
	}
	
	void printDetails()
	{
		System.out.println("Employee Type : Third Party ContractBased Employee");
		System.out.println("Employee Id : "+getEmpId());
		System.out.println("Employee Name : "+name);
		System.out.println("Employee service years : "+noOfYears);
		System.out.println("Employee Salary : "+getSalary());
		System.out.println("-------------------------------------");
	}
	
}

class EmployeeDemo
{
	public static void main(String args[])
	{
		RegularEmployee re = new RegularEmployee(1, "Rohit", 25000);
		//CdacEmployee ce = new CdacEmployee(2, "Mohit",3, 20000);
		//ThirdPartyEmployee te = new ThirdPartyEmployee(0, "Rajesh",4, 30000);
		
		re.printDetails();
		//ce.printDetails();
		//te.printDetails();
	}
}