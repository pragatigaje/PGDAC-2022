using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeInterface3
{
    public abstract class Employee : IDBFunctions
    {

        private static int count = 0;
        public Employee(String NAME = "NOnAME", short DEPTNO = 1)
        {
            this.DEPTNO = DEPTNO;
            this.NAME = NAME;
            this.EmpNo = ++count;

        }

        private String Name;
        public String NAME
        {
            get
            {
                return Name;
            }
            set
            {
                if (value != null)
                    Name = value;
                else
                    Console.WriteLine("Invalid Name");

            }
        }

        private int EmpNo;
        public int EMPNO
        {
            get { return EmpNo; }
        }

        private short DeptNo;
        public short DEPTNO
        {
            get { return DeptNo; }
            set
            {
                if (value > 0)
                    DeptNo = value;
                else
                    Console.WriteLine("Invalid deptNo");
            }
        }

        protected decimal Basic;

        public abstract decimal BASIC
        { get; set; }

        public abstract decimal CalcNetSalary();
        public abstract void Insert();
        public abstract void Update();
        public abstract void Delete();
        public abstract void Display();
    }
}
