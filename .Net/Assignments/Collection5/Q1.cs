/*
1. Declare a dictionary based collection of Employee class objects 
        
1. Accept details for Employees  in a loop. Stop accepting based on user input (yes/no)'
2. Display the Employee with highest Salary
3. Accept EmpNo to be searched. Display all details for that employee.
4. Display details for the Nth Employee where N is a number accepted from the user. 
*/

using System.Xml;

namespace Collection5
{
    internal class Q1
    {

        private static void AddEmployee(SortedList<int,Employee> EmpDictionary)
        {
            int exit;
            Console.WriteLine("Enter details of employees");
            do
            {
                Console.WriteLine("Enter id of employee ");
                int id = int.Parse(Console.ReadLine());

                Console.WriteLine("Enter name of employee ");
                String name = Console.ReadLine();

                Console.WriteLine("Enter salary of employee ");
                decimal sal = decimal.Parse(Console.ReadLine());

                EmpDictionary.Add(id, new Employee() { Name = name, Salary = sal });

                Console.WriteLine("Employee added successfully !");
                Console.WriteLine("-----------------------------------------------------------------");
                Console.WriteLine("Enter 0 to add more employees");
                exit = int.Parse(Console.ReadLine());
            }while(exit==0);
        }
        private static void DisplayAll(SortedList<int, Employee> EmpDictionary)
        {
            foreach(KeyValuePair<int,Employee> emp in EmpDictionary)
            {
                Console.WriteLine("Id : " + emp.Key+ "Name : "+emp.Value.Name+" Salary : "+emp.Value.Salary);
            }
            Console.WriteLine("-----------------------------------------------------------------");
        }
        private static void SearchEmployee(SortedList<int, Employee> EmpDictionary)
        {
            Console.WriteLine("Enter id of employee to be search : ");
            int id = int.Parse(Console.ReadLine());
            bool flag = false;
            foreach (KeyValuePair<int, Employee> emp in EmpDictionary)
            {
                if(id==emp.Key)
                {
                    Console.WriteLine("Id : " + emp.Key + "Name : " + emp.Value.Name + " Salary : " + emp.Value.Salary);
                    flag = true;
                    break;
                }                   
            }
            if(flag==false)
            {
                Console.WriteLine("Employee doesnt exist !");
            }
            Console.WriteLine("-----------------------------------------------------------------");
        }

        private static void HighestSal(SortedList<int, Employee> EmpDictionary)
        {
            Console.WriteLine("Employee with highest salary is :");
            int keyemp = 0;
            decimal highsal=0;
            foreach (KeyValuePair<int, Employee> emp in EmpDictionary)
            {
                if (highsal < emp.Value.Salary)
                {
                    highsal = emp.Value.Salary;
                    keyemp = emp.Key;
                }
            }
            foreach (KeyValuePair<int, Employee> emp in EmpDictionary)
            {
                if (keyemp == emp.Key)
                {
                    Console.WriteLine("Id : " + emp.Key + "Name : " + emp.Value.Name + " Salary : " + emp.Value.Salary);
                    break;
                }
            }
            Console.WriteLine("-----------------------------------------------------------------");

        }
        static void Main1(string[] args)
        {
            SortedList<int,Employee> EmpDictionary = new SortedList<int,Employee>();
            int exit;
            do
            {
                
                Console.WriteLine("Enter Opertaion to be perform : ");
                Console.WriteLine("1.Add Employee 2.Display Employees 3.Search Employeee 4.Employee with highest salary");
                int ch = int.Parse(Console.ReadLine());

                switch (ch)
                {
                    case 1:
                        AddEmployee(EmpDictionary);
                        break;

                    case 2:
                        DisplayAll(EmpDictionary);
                        break;

                    case 3:
                        SearchEmployee(EmpDictionary);
                        break;
                    case 4:
                        HighestSal(EmpDictionary);
                        break;
                    default:
                        break;
                }
                Console.WriteLine("-----------------------------------------------------------------");
                Console.WriteLine("Enter 0 to go back to menu");
                exit = int.Parse(Console.ReadLine());
            } while (exit==0);
        }

        protected class Employee
        {
            public int Id { get; set; }
            public string Name { get; set; }
            public decimal Salary { get; set; }

        }
    }
}