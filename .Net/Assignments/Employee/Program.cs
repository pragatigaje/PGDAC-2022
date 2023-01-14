/*Create a Class Employee with the following specifications


Properties
----------
string Name -> no blank names should be allowed
int EmpNo -> must be greater than 0
decimal Basic -> must be between some range
short DeptNo -> must be > 0

Methods
-------
decimal GetNetSalary() -> returns calculated net salary (Use any formula to get net salary based on Basic salary)


Create constructors to accept initial values for Employee obj
eg
Employee o1 = new Employee(1, "Amol", 123465, 10);
Employee o2 = new Employee(1, "Amol", 123465);
Employee o3 = new Employee(1, "Amol");
Employee o4 = new Employee(1);
Employee o5 = new Employee();*/

namespace Employee
{
    internal class Employee
    {
        private String name;
        private int empNo;
        private decimal basic;
        private short deptNo;

        public String NAME
        {
            get 
            { return name; }
            set 
            {
                if (value.Length != 0)
                    name = value;
                else
                    Console.WriteLine("Invalid Name");

            }
        }

        public int EMPNO
        {
            get { return empNo; }

            set
            {
                if (value > 0)
                    empNo = value;
                else
                    Console.WriteLine("Invalid empNo");
            }
        }

        public decimal BASIC
        {
            get { return basic; }
            set
            {
                if (value>10000 && value<250000)
                {
                   basic= value;
                }
                else
                    Console.WriteLine("Invalid basic pay");
            }
        }
        public short DEPTNO
        {
            get { return deptNo; }
            set
            {
                if (value > 0)
                    deptNo = value;
                else
                    Console.WriteLine("Invalid deptNo");
            }
        }

        public Employee( int EMPNO=101, String NAME ="", decimal BASIC=12500.5m, short DEPTNO=2)
        {
            this.NAME= NAME;
            this.EMPNO=EMPNO;
            this.BASIC= BASIC;
            this.DEPTNO=DEPTNO;
        }
        public decimal GetNetSalary(decimal basic)
        {
            decimal netSal = (decimal) basic * 0.6m;
            return netSal;
        }

        public static void Display(Employee o)
        {
            Console.WriteLine(o.empNo + " " + o.name + " " + o.basic+" "+o.deptNo);
        }

        static void Main(string[] args)
        {
            Employee o1 = new Employee(1, "Amol", 123465, 10);
            Employee o2 = new Employee(1, "Amol", 123465);
            Employee o3 = new Employee(1, "Amol");
            Employee o4 = new Employee(1);
            Employee o5 = new Employee();

            Display(o1);
            Display(o2);
            Display(o3);
            Display(o4);
            Display(o5);



        }
    }
}