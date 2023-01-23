//query syntax
using System.Diagnostics;

namespace LinqExample1
{
    public class Department
    {
        public int DeptNo { get; set; }
        public string DeptName { get; set; }
    }
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public string Gender { get; set; }
        public override string ToString()
        {
            string s = Name + "," + EmpNo.ToString() + "," + Basic.ToString() + "," + DeptNo.ToString();
            return s;
        }
    }
    internal class Program
    {
        static List<Employee> lstEmp = new List<Employee>();
        static List<Department> lstDept = new List<Department>();
        public static void AddRecs()
        {
            lstDept.Add(new Department { DeptNo = 10, DeptName = "SALES" });
            lstDept.Add(new Department { DeptNo = 20, DeptName = "MKTG" });
            lstDept.Add(new Department { DeptNo = 30, DeptName = "IT" });
            lstDept.Add(new Department { DeptNo = 40, DeptName = "HR" });

            lstEmp.Add(new Employee { EmpNo = 1, Name = "Vikram", Basic = 10000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 2, Name = "Vikas", Basic = 11000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 3, Name = "Abhijit", Basic = 12000, DeptNo = 20, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 4, Name = "Mona", Basic = 11000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 5, Name = "Shweta", Basic = 12000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 6, Name = "Sanjay", Basic = 11000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 7, Name = "Arpan", Basic = 10000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 8, Name = "Shraddha", Basic = 11000, DeptNo = 40, Gender = "F" });
        }
        static void Main1()
        {
            AddRecs();
            //var returnvalue = from single_object in collection select something;
            var emps = from emp in lstEmp select emp;

            //IEnumerable<Employee> emps = from emp in lstEmp select emp;
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name);
                Console.WriteLine(emp.EmpNo);
            }

        }
        static void Main2()
        {
            AddRecs();
            //var returnvalue = from single_object in collection select something;
            //var emps = from emp in lstEmp select emp.Name;
            var emps = from emp in lstEmp select emp.Basic;
            foreach (var emp in emps)
            {
                Console.WriteLine(emp);
            }

        }
        static void Main3()
        {
            AddRecs();
            //var emps = from emp in lstEmp select emp.Name;
            //var emps = from emp in lstEmp select emp.Basic;
            var emps = from emp in lstEmp select new { emp.Name, emp.EmpNo };
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.EmpNo);
                Console.WriteLine(emp.Name);
            }

        }

        static void Main4()
        {
            AddRecs();
            var emps = from emp in lstEmp
                       where emp.Basic > 10000
                       select emp;

            //var emps = from emp in lstEmp
            //           where emp.Basic > 10000 && emp.Basic < 12000
            //           select emp;

            //var emps = from emp in lstEmp
            //           where emp.Name.StartsWith("V")
            //           select emp;
            foreach (var emp in emps)
            {
                Console.WriteLine(emp);
            }

            Console.ReadLine();

        }
        static void Main5()
        {
            AddRecs();


            //var emps = from emp in lstEmp
            //           //where emp.Basic > 10000
            //           orderby emp.Name 
            //           select emp;
            //var emps = from emp in lstEmp
            //           orderby emp.Name descending
            //           select emp;

            var emps = from emp in lstEmp
                       orderby emp.DeptNo ascending, emp.Name descending
                       select emp;


            foreach (var emp in emps)
            {
                Console.WriteLine(emp);
            }

            Console.ReadLine();

        }
        static void Main6()
        {
            AddRecs();
            var emps = from emp in lstEmp
                       join dept in lstDept
                             on emp.DeptNo equals dept.DeptNo
                       select emp;

            var emps1 = from emp in lstEmp
                        join dept in lstDept
                              on emp.DeptNo equals dept.DeptNo
                        select dept;

            var emps2 = from emp in lstEmp
                        join dept in lstDept
                              on emp.DeptNo equals dept.DeptNo
                        select new { emp, dept };


            var emps3 = from emp in lstEmp
                        join dept in lstDept
                              on emp.DeptNo equals dept.DeptNo
                        select new { emp.Name, dept.DeptName };

            foreach (var emp in emps2)
            {
                Console.WriteLine(emp.dept.DeptName);
                Console.WriteLine(emp.emp.Name);

            }

            foreach (var emp in emps3)
            {
                Console.WriteLine(emp.Name);
                Console.WriteLine(emp.DeptName);
            }
            Console.ReadLine();
        }

    }
}

//lamda syntax
namespace LinqExample2
{
    public class Department
    {
        public int DeptNo { get; set; }
        public string DeptName { get; set; }
    }
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public string Gender { get; set; }
        public override string ToString()
        {
            string s = Name + "," + EmpNo.ToString() + "," + Basic.ToString() + "," + DeptNo.ToString();
            return s;
        }
    }
    internal class Program
    {
        static List<Employee> lstEmp = new List<Employee>();
        static List<Department> lstDept = new List<Department>();
        public static void AddRecs()
        {
            lstDept.Add(new Department { DeptNo = 10, DeptName = "SALES" });
            lstDept.Add(new Department { DeptNo = 20, DeptName = "MKTG" });
            lstDept.Add(new Department { DeptNo = 30, DeptName = "IT" });
            lstDept.Add(new Department { DeptNo = 40, DeptName = "HR" });

            lstEmp.Add(new Employee { EmpNo = 1, Name = "Vikram", Basic = 10000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 2, Name = "Vikas", Basic = 11000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 3, Name = "Abhijit", Basic = 12000, DeptNo = 20, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 4, Name = "Mona", Basic = 11000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 5, Name = "Shweta", Basic = 12000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 6, Name = "Sanjay", Basic = 11000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 7, Name = "Arpan", Basic = 10000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 8, Name = "Shraddha", Basic = 11000, DeptNo = 40, Gender = "F" });
        }


        static Employee GetEmp1(Employee obj)
        {
            return obj;
        }
        static string GetEmp2(Employee obj)
        {
            return obj.Name;
        }
        static void Main1()
        {
            AddRecs();
            // var emps = from emp in lstEmp select emp;

            var emps1 = lstEmp.Select(GetEmp1);  //func
            var emps1a = lstEmp.Select(delegate(Employee obj)
            {
                return obj;
            });  //anon method
            var emps1b = lstEmp.Select(obj => obj); //lambda
            var emps2a = lstEmp.Select(obj => obj.Name); //lambda
            var emps2b = lstEmp.Select(obj => new { obj.Name , obj.EmpNo}); //lambda

            var emps2 = lstEmp.Select(GetEmp2);

            //foreach (var emp in emps)
            //{
            //    Console.WriteLine(emp.Name);
            //    Console.WriteLine(emp.EmpNo);
            //}

        }
        

        static bool IsBasicGreaterThan10000(Employee obj)
        {
            return obj.Basic > 10000;
            //if (obj.Basic > 10000)
            //    return true;
            //else
            //    return false;
        }
         static void Main4()
        {
            AddRecs();
            //var emps = from emp in lstEmp
            //           where emp.Basic > 10000
            //           select emp;

            var emps = lstEmp.Where(IsBasicGreaterThan10000);
            //var emp2a = lstEmp.Where(emp => emp.Basic > 10000);
            //var emp2b = lstEmp.Where(emp => emp.Basic > 10000).Select(emp => emp);
            //var emp2c = lstEmp.Select(emp => emp).Where(emp => emp.Basic > 10000);


            var emp3b = lstEmp.Where(emp => emp.Basic > 10000).Select(emp => emp.Name);
            //var emp3c = lstEmp.Select(emp => emp.Name).Where(emp => emp.Basic > 10000);


            //foreach (var emp in emps)
            //{
            //    Console.WriteLine(emp);
            //}

            Console.ReadLine();

        }
        static void Main5()
        {
            AddRecs();


            //var emps = from emp in lstEmp
            //           orderby emp.Name 
            //           select emp;

            // var emps = lstEmp.OrderBy(emp => emp.Name);
            //var emps = lstEmp.OrderByDescending(emp => emp.Name);

            //var emps = from emp in lstEmp
            //           orderby emp.Name descending
            //           select emp;

            var emps = from emp in lstEmp
                       orderby emp.DeptNo ascending, emp.Name descending
                       select emp;

            //var emps2 = lstEmp.OrderBy(emp => emp.DeptNo).OrderByDescending(emp => emp.Name);
            //var emps2 = lstEmp.OrderBy(emp => emp.DeptNo).ThenBy(emp => emp.Name);
            var emps2 = lstEmp.OrderBy(emp => emp.DeptNo).ThenByDescending(emp => emp.Name);

            foreach (var emp in emps)
            {
                Console.WriteLine(emp);
            }

            Console.WriteLine();
            Console.WriteLine();
            foreach (var emp in emps2)
            {
                Console.WriteLine(emp);
            }
        }
        static void Main6()
        {
            AddRecs();
            //var emps = from emp in lstEmp
            //           join dept in lstDept
            //                 on emp.DeptNo equals dept.DeptNo
            //           select emp;

            var emps = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => emp);
            var emps1 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => dept);
            var emps2 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => new { emp, dept });
            var emps3 = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => new { emp.Name, dept.DeptName });


            //var emps1 = from emp in lstEmp
            //            join dept in lstDept
            //                  on emp.DeptNo equals dept.DeptNo
            //            select dept;

            //var emps2 = from emp in lstEmp
            //            join dept in lstDept
            //                  on emp.DeptNo equals dept.DeptNo
            //            select new { emp, dept };


            //var emps3 = from emp in lstEmp
            //            join dept in lstDept
            //                  on emp.DeptNo equals dept.DeptNo
            //            select new { emp.Name, dept.DeptName };



            foreach (var emp in emps)
            {
                Console.WriteLine(emp);
            }
            Console.ReadLine();
        }

        static void Main7()
        {
            AddRecs();
            var emps = from emp in lstEmp
                       group emp by emp.DeptNo;
            foreach (var item in emps)
            {
                Console.WriteLine(item.Key); //deptno
                foreach (var e in item)  //e is an Employee, item is a grouping of Employee
                {
                    Console.WriteLine(e);
                }
                Console.WriteLine();
            }
            Console.ReadLine();
        }
        static void Main8()
        {
            AddRecs();

            var emps = from emp in lstEmp
                       group emp by emp.DeptNo into group1
                       select group1;


            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Key); //deptno
                foreach (var e in emp)  //e is an Employee
                {
                    Console.WriteLine(e);
                }
                Console.WriteLine();
            }

            Console.ReadLine();

        }

        static void Main9()
        {
            AddRecs();

            var emps = from emp in lstEmp
                       group emp by emp.DeptNo into group1
                       select new { group1, Count = group1.Count(), Max = group1.Max(x => x.Basic), Min = group1.Min(x => x.Basic) };


            foreach (var emp in emps)
            {

                Console.WriteLine(emp.group1.Key); //DeptNo
                Console.WriteLine(emp.Count); //count
                Console.WriteLine(emp.Min); //min
                Console.WriteLine(emp.Max); //max
                //emp.group1.Key;  //DeptNo

                foreach (var e in emp.group1)  //e is an Employee
                {
                    Console.WriteLine(e);
                }
                Console.WriteLine();
            }

            Console.ReadLine();

        }

        static void Main10()
        {
            AddRecs();
            Employee emp = lstEmp.Single(e => e.EmpNo == 1); //one record = okay
            //Employee emp = lstEmp.Single(e => e.EmpNo == 10);  //no records = error
            //Employee emp = lstEmp.Single(e => e.Basic > 5000); //multiple records - error


            //Employee emp = lstEmp.SingleOrDefault(e => e.EmpNo == 1); //one record = okay
            //Employee emp = lstEmp.SingleOrDefault(e => e.EmpNo == 10); //no records=null
            //Employee emp = lstEmp.SingleOrDefault(e =>  e.Basic > 5000);//multiple records - error

            if (emp != null)
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            else
                Console.WriteLine("not found");
            Console.ReadLine();
        }

        static void Main11()
        {
            AddRecs();
            //deferred execution
            var emps = from emp in lstEmp select emp;

            Console.WriteLine();
            lstEmp.RemoveAt(0);

            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            Console.ReadLine();


            Console.WriteLine();
            lstEmp.Add(new Employee { EmpNo = 9, Name = "New", Basic = 11000, DeptNo = 40, Gender = "F" });
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            Console.ReadLine();
        }
        //imm
        static void Main12()
        {
            AddRecs();
            //var emps = (from emp in lstEmp select emp).ToList();
            var emps = from emp in lstEmp select emp;
            //immediate execution
            emps = emps.ToList();  //.ToArray .ToDictionary
            //Employee [] arrEmps = emps.ToArray();
            //Dictionary<int, Employee> d = emps.ToDictionary(e => e.EmpNo);

            Console.WriteLine();
            lstEmp.RemoveAt(0);
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            Console.ReadLine();
            Console.WriteLine();
            lstEmp.Add(new Employee { EmpNo = 9, Name = "New", Basic = 11000, DeptNo = 40, Gender = "F" });
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            Console.ReadLine();
        }
        static void Main()
        {
            //AddRecs();
            AddRecs2();
            //plinq example

            Stopwatch stopwatch = new Stopwatch();

            stopwatch.Start();
            //var emps = lstEmp.Select(emp => new { Name = LongRunningFunc(emp.Name), emp.EmpNo });
            var emps = lstEmp.AsParallel().WithDegreeOfParallelism(2).Select(emp => new { Name = LongRunningFunc(emp.Name), emp.EmpNo });

            //var emps2 = lstEmp.AsParallel();

            //Console.WriteLine("Elapsed Time is {0} ms", stopwatch.ElapsedMilliseconds);
            foreach (var emp in emps)
            {
                Console.WriteLine(emp.Name + "," + emp.EmpNo);
            }
            stopwatch.Stop();
            Console.WriteLine("Elapsed Time is {0} ms", stopwatch.ElapsedMilliseconds);

            Console.ReadLine();
        }
        public static void AddRecs2()
        {
            for (int i = 0; i < 200; i++)
            {
                lstEmp.Add(new Employee { EmpNo = i + 1, Name = "Vikram" + i, Basic = 10000, DeptNo = 10, Gender = "M" });
            }
        }
        public static string LongRunningFunc(string s)
        {
            System.Threading.Thread.Sleep(10);
            return s.ToUpper();
        }
    }
}

//linqsamples.com