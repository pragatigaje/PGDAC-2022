class Employee
{
        private int empId;
        private String name;

        public Employee()
        {
        }

	public Employee(int empId, String name)
	{
		this.empId = empId;
		this.name = name;
	}
	
	public int getEmpId()
	{
		return this.empId;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}

class GetterSetterDemo
{
        public static void main(String args[])
        {
                Employee emp = new Employee();
                //emp.empId = 1;
		emp.setEmpId(1);

		//int eid = emp.empId;
		int eid = emp.getEmpId();
		System.out.println(eid);

        }
}      
