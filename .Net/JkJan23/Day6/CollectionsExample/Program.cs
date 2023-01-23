using System.Collections;
namespace CollectionsExample
{
    internal class Program
    {
        static void Main1()
        {
            ArrayList objArrayList = new ArrayList();
            objArrayList.Add(10);
            objArrayList.Add("Vikram");
            objArrayList.Add(10.1234);
            objArrayList.Add(true);

            objArrayList.Insert(0, "new");

            //objArrayList.AddRange(objArrayList2);
            //objArrayList.InsertRange(0,objArrayList2);

            //objArrayList.Remove(10);  //element 10
            //objArrayList.RemoveAt(10); // index 10
            //objArrayList.RemoveRange(0, 3); //index, count

            Console.WriteLine(objArrayList.Count);

            //int pos = objArrayList.BinarySearch(10);
            //pos = objArrayList.LastIndexOf(10);
            //pos = objArrayList.IndexOf(10);

            //objArrayList.Clear(); //remove all
            //bool isPresent = objArrayList.Contains(10);

            //object[] objArray = new object[objArrayList.Count];
            //objArrayList.CopyTo(objArray);
            //object[] objArr2 = objArrayList.ToArray();

            //ArrayList objArrLst2 = objArrayList.GetRange(0, 3);
            //objArrayList.Reverse();
            //objArrayList.Sort();

            //objArrayList.SetRange(3, objArrLst2);

            //objArrayList.this[0] = 1234; //indexer
            //objArrayList[0] = 1234;
            //Console.WriteLine(objArrayList[0]);

            //objArrayList.Capacity = 10000;
            /*
             loop()
             {
                  read value from db
                  add value into arraylist
             }
             */ 
            //objArrayList.TrimToSize();

            Console.WriteLine();
            foreach (object item in objArrayList)
            {
                Console.WriteLine(item);
            }


        }
        static void Main2()
        {
            //Hashtable objDictionary = new Hashtable();
            SortedList objDictionary = new SortedList();
            objDictionary.Add(2, "Pratik");
            objDictionary.Add(1, "Yogesh");
            objDictionary.Add(3, "Shubham");
            objDictionary.Add(4, "Shubham");

            objDictionary[4] = "changed";
            objDictionary[5] = "new";

            //objDictionary.Remove(1);  //key
            //objDictionary.RemoveAt(1);  //index

            //bool isPresent = objDictionary.Contains(1);  //key
            //isPresent = objDictionary.ContainsKey(1);  //key
            //objDictionary.ContainsValue("Shubham"); //value

            //objDictionary.GetByIndex(index);//value
            //objDictionary.GetKey(index);  //key
            IList objIList = objDictionary.GetKeyList();  //returns IList of keys
            foreach (object item in objIList)
            {
                Console.WriteLine(item);
            }
            //objDictionary.GetValueList(); //returns IList of values

            //ICollection objICollection = objDictionary.Keys;
            //ICollection objICollection2 = objDictionary.Values;

            //objDictionary.IndexOfKey
            //objDictionary.IndexOfValue
            //objDictionary.SetByIndex(index, value)

            foreach (DictionaryEntry item in objDictionary)
            {
                Console.WriteLine($"key is {item.Key}, value is {item.Value}");
            }

        }
        static void Main3()
        {
            Stack s = new Stack();
            s.Push(100);
            Console.WriteLine(s.Peek());
            Console.WriteLine(s.Pop());

            Queue q = new Queue();
            q.Enqueue(100);
            Console.WriteLine(q.Peek());
            Console.WriteLine(q.Dequeue());
        }

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
                Console.WriteLine(item.Key); //EmpNo
                //Console.WriteLine(item.Value.EmpNo);
                Console.WriteLine(item.Value.Name);  //Name

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
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }

    }
}