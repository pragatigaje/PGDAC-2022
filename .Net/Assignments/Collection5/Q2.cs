/*
Create an array of Employee objects. Convert it to a List<Employee>.
Display all the Employees in the list. 
*/
namespace Collection5
{
    internal class Q2
    {
        static void Main2(string[] args)
        {
            Console.WriteLine("----------------- Q2 -----------------");
            Employee[] employees = new Employee[] { new Employee() {Id=1,Name="Pragati", Salary=2000 },
                                                    new Employee() {Id=2,Name= "Pooja", Salary=5000},
                                                    new Employee() {Id=3,Name = "Prachi", Salary=3000},
                                                    new Employee() {Id=4,Name = "Nikita", Salary=6000}
            };

            List<Employee> empList = new List<Employee>();
            empList.AddRange(employees);

            foreach (Employee emp in empList)
            {
                Console.WriteLine("Id :"+ emp.Id+" Name : " + emp.Name+ "   Salary : "+ emp.Salary);
            }

        }
    }

    public class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public decimal Salary { get; set; }

    }
}
