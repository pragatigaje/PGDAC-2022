using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeInterface3
{
    public class Manager : Employee
    {
        private String Designation;
        public String DESIGNATION
        {
            get { return Designation; }

            set
            {
                if (value != null)
                    Designation = value;
                else
                    Console.WriteLine("Invalid Designation ");
            }
        }
        public override decimal BASIC
        {
            set
            {
                Basic = value;
            }

            get 
            { 
                return Basic; 
            }
        }

        public override decimal CalcNetSalary()
        {
            return this.BASIC * 0.8m;
        }


        public override void Insert()
        {
            Console.WriteLine("Manager inserted successfully");
        }

        public override void Update()
        {
            Console.WriteLine("Manager updated successfully");
        }

        public override void Delete()
        {
            Console.WriteLine("Manager deleted successfully");
        }

        public override void Display()
        {
            Console.WriteLine("Manager : "+this.EMPNO + " " + this.NAME + " " + this.DEPTNO + " " + this.DESIGNATION + " " + this.CalcNetSalary());
        }

        public Manager(String NAME = "NOnAME", short DEPTNO = 101, String DESIGNATION = "NoDesgn", decimal basic=50000) : base(NAME, DEPTNO)
        {
            this.BASIC = basic;
            this.DESIGNATION = DESIGNATION;
        }
    }
}
