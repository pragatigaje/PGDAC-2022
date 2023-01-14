using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace Arrays4
{
    internal class Q2
    {
        static void HighestSalary(Employee[] err)
        {
            decimal salary = 0;
            int index = 0;
            for ( int i = 0; i < err.Length; i++)
            {
                if (err[i].Salary > salary)
                {
                    salary = err[i].Salary;
                    index = i;
                }
            }
            Console.WriteLine("------- Details of Employee with Highest Salary ---------");
            Console.WriteLine($"Employee {index + 1}: Id: " + err[index].Id + " Name : " + err[index].Name + " Salary :" + err[index].Salary);
        }

        static void SearchEmployee(Employee[] err) 
        {
            Console.WriteLine("Enter id of employee to be search : ");
            int id= int.Parse(Console.ReadLine());

            for (int i = 0; i < err.Length; i++)
            {
                if (err[i].Id == id)
                {
                    Console.WriteLine($"Employee {i + 1}: Id: " + err[i].Id + " Name : " + err[i].Name + " Salary :" + err[i].Salary);
                }
            }
        }
        public static void Main()
        {
            Console.WriteLine("Welcome to Employee Management !!!");
            Console.WriteLine("Enter no of employee ");
            int noOfEmp = int.Parse(Console.ReadLine());

            Employee[] err = new Employee[noOfEmp];

            for (int i=0; i<err.Length; i++)
            {
                Console.WriteLine("Enter id of employee {0} ",i+1);
                int id = int.Parse(Console.ReadLine());

                Console.WriteLine("Enter name of employee {0} ",i+1);
                String name = Console.ReadLine();

                Console.WriteLine("Enter salary of employee {0} ", i + 1);
                decimal sal = decimal.Parse(Console.ReadLine());

                err[i] = new Employee(id, name, sal);
            }

            Console.WriteLine("Details of Employees");
            for(int i=0; i<err.Length;i++)
            {
                Console.WriteLine($"Employee {i+1}: Id: " + err[i].Id +" Name : " + err[i].Name+ " Salary :" + err[i].Salary);
            }

            HighestSalary(err);
            SearchEmployee(err);

        }
    }

    public class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public decimal Salary { get; set; }

        public Employee() { }

        public Employee(int id, string name, decimal salary)
        {
            this.Id = id;
            this.Name = name;
            this.Salary = salary;
        }
    }
}
