namespace EmployeeAssign
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee2 o = new Employee2("");
            //o.EmpNo = 12;  //error
            o.Basic = 12345;
            o.Name = "";

        }
    }

    public class Employee1
    {
        private string name;
        public string Name
        {
            get
            {
                return name;
            }
            set
            {
                if (!string.IsNullOrEmpty(value))
                    name = value;
                else
                    Console.WriteLine("invalid name");
            }
        }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }

        private static int lastEmpNo;
        private int empNo;
        public int EmpNo
        {
            get { return empNo; }
        }
        public Employee1(string Name="noname", decimal Basic=10000, int deptNo=10)
        {
            this.empNo = ++lastEmpNo;
            
            this.Name = Name;
            this.Basic = Basic;
            this.DeptNo = DeptNo;
        }
    }

    public class Employee2
    {
        private string name;
        public string Name
        {
            get
            {
                return name;
            }
            set
            {
                if (!string.IsNullOrEmpty(value))
                    name = value;
                else
                    Console.WriteLine("invalid name");
            }
        }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }

        private static int lastEmpNo;
        private int empNo;
        public int EmpNo
        {
            get { return empNo; }
            //you can only decrease access, not increase it
            //only one of get/set can have a property accessor
            private set //property accessor
            {
                empNo = value;
            }
        }
        public Employee2(string Name = "noname", decimal Basic = 10000, int deptNo = 10)
        {
            this.EmpNo = ++lastEmpNo;
            this.Name = Name;
            this.Basic = Basic;
            this.DeptNo = DeptNo;
        }
    }

    public class Employee3
    {
        private string name;
        public string Name
        {
            get
            {
                return name;
            }
            set
            {
                if (!string.IsNullOrEmpty(value))
                    name = value;
                else
                    Console.WriteLine("invalid name");
            }
        }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }

        private static int lastEmpNo;
        
        //readonly auto property
        public int EmpNo
        {
            get;
        }
        public Employee3(string Name = "noname", decimal Basic = 10000, int deptNo = 10)
        {
            this.EmpNo = ++lastEmpNo;
            this.Name = Name;
            this.Basic = Basic;
            this.DeptNo = DeptNo;
        }
        
    }
}