using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static CollectionsDemo.ArrayListDemo;

namespace CollectionsDemo
{
    internal class GenericCollectionsDemo
    {
        static void Main4()
        {
            List<int> objListInt = new List<int>();
            objListInt.Add(10);

            foreach (int item in objListInt)
            {
                Console.WriteLine(item);
            }

            List<Employee> objListEmp = new List<Employee>();
            objListEmp.Add(new Employee { EmpNo = 1, Name = "Yogesh" });
            objListEmp.Add(new Employee { EmpNo = 2, Name = "Pratik" });

            foreach (Employee item in objListEmp)
            {
                Console.WriteLine(item.EmpNo);
                Console.WriteLine(item.Name);
            }

        }
        static void Main5()
        {

            SortedList<int, Employee> objSortedList = new SortedList<int, Employee>();
            objSortedList.Add(1, new Employee { EmpNo = 1, Name = "Yogesh" });
            objSortedList.Add(2, new Employee { EmpNo = 2, Name = "Pratik" });

            foreach (KeyValuePair<int, Employee> item in objSortedList)
            {
                Console.WriteLine(item.Key);        //EmpNo
                                                    //Console.WriteLine(item.Value.EmpNo);
                Console.WriteLine(item.Value.Name); 
                
                
                //Name

            }

        }
        static void Main()
        {
            Stack<int> s = new Stack<int>();
            s.Push(1);
            Console.WriteLine(s.Pop());

            Queue<int> q = new Queue<int>();
            q.Enqueue(10);
            Console.WriteLine(q.Dequeue());
        }
    }
}
