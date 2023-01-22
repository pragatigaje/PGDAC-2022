/*
Create a List<Employee>. Convert it to an array. Display all the array elements. 
*/
namespace Collection5
{
    internal class Q3
    {
       public static void Main()
        {
            Console.WriteLine("----------------- Q3 -----------------");
            List<Employee> empList = new List<Employee>();
            empList.Add(new Employee() { Id = 1, Name = "Pragati", Salary = 2000 });
            empList.Add(new Employee() { Id = 2, Name = "Pooja", Salary = 5000 });
            empList.Add(new Employee() { Id = 3, Name = "Prachi", Salary = 3000 });
            empList.Add(new Employee() { Id = 4, Name = "Nikita", Salary = 6000 });

            Employee[] err = empList.ToArray();

            foreach(Employee emp in err)
            {
                Console.WriteLine("Id :" + emp.Id + " Name : " + emp.Name + "   Salary : " + emp.Salary);
            }
        }
    }

}
