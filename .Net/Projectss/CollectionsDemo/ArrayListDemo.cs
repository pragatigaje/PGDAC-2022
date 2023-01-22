using System.Collections;

namespace CollectionsDemo
{
    internal class ArrayListDemo
    {
        static void Main(string[] args)
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


        }
        public class Employee
        {
            public int EmpNo { get; set; }
            public string Name { get; set; }

        }
    }
    }
}

