using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeInterface3
{
    public class CEO : Employee
    {
        public override decimal BASIC 
        { 
            set
            {
                Basic= value;
            }
            get
            {
                return Basic;
            }
        }

        public sealed override decimal CalcNetSalary()
        {
            return Basic * 2;
        }
        public override void Insert()
        {
            Console.WriteLine("CEO inserted successfully");
        }

        public override void Update()
        {
            Console.WriteLine("CEO updated successfully");
        }

        public override void Delete()
        {
            Console.WriteLine("CEO deleted successfully");
        }

        public override void Display()
        {
            Console.WriteLine("CEO : " + this.EMPNO + " " + this.NAME + " " + this.DEPTNO + " " + this.CalcNetSalary());
        }

        public CEO(String NAME = "NOnAME", short DEPTNO = 101, decimal basic = 100000) :base(NAME,DEPTNO)
        {
            this.BASIC= basic;
        }
    }
}
