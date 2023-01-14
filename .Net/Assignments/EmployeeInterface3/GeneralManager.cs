using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeInterface3
{
    public class GeneralManager : Manager
    {
 
        private string Perks = " ";
        public string PERKS
        {
            set
            {
                if (value.Length > 0)
                {
                    Perks = value;
                }
                else
                {
                    Console.WriteLine("Perks can't be blank");
                }
            }
            get { return Perks; }
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
            return this.BASIC * 0.7m;
        }

        public override void Insert()
        {
            Console.WriteLine("General Manager inserted successfully");
        }

        public override void Update()
        {
            Console.WriteLine("General Manager update successfully");
        }

        public override void Delete()
        {
            Console.WriteLine("General Manager deleted successfully");
        }

        public override void Display()
        {
            Console.WriteLine("General Manager : " + this.EMPNO + " " + this.NAME + " " + this.DEPTNO + " " + this.DESIGNATION + " " + this.CalcNetSalary());
        }

        public GeneralManager(String NAME = "NOnAME", short DEPTNO = 101, String DESIGNATION = "NoDesgn", decimal basic = 40000, String Perks="Travel") : base(NAME, DEPTNO,DESIGNATION)
        {
            this.BASIC = basic;
            this.PERKS = Perks;
        }
    }
}
