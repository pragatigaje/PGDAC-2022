namespace RefAndValueTypes1
{
    internal class Program
    {
        static void Main1()
        {
            Class1 o1 = new Class1();
            Class1 o2 = new Class1();
            o1.i = 100;
            o2.i = 200;

            o1 = o2;

            o1.i = 300;
            Console.WriteLine(o1.i);
            Console.WriteLine(o2.i);
            Console.ReadLine();
        }
        //200,300
        //300,300
   
        static void Main2()
        {
            int o1, o2;
            o1 = 100;
            o2 = 200;
            o1 = o2;
            o2 = 300;
            Console.WriteLine(o1);
            Console.WriteLine(o2);
            Console.ReadLine();
        }
        //200,300

        static void Main3()
        {
            string o1, o2;
            o1 = "100";
            o2 = "200";
            o1 = o2;
            o2 = "300";
            Console.WriteLine(o1);
            Console.WriteLine(o2);
            Console.ReadLine();
        }
        //300,300
        //200,300
        static void DataTypes()
        {
            byte BYTE;
            sbyte SBYTE;
            short SHORT; //Int16
            ushort USHORT;
            int i; //Int32 - 4
            uint UINT; //UInt32
            long LONG;
            ulong ULONG;

            float FLOAT;
            double DOUBLE;
            decimal DECIMAL;

            bool BOOL;
            char CHAR;

            string STRING;
            object OBJECT;
        }

        //Boxing/Unboxing
        static void Main123()
        {

            int i = 100;  //value type
            object obj;
            obj = i;  //Boxing a value type

            int j;
            j = (int)obj;  //Unboxing 



        }

        static void Main6()
        {
            int i=100;
            int j=200;
            Init(out i,out j);
            Swap(ref i,ref j);
            //Console.WriteLine(i);
            //Console.WriteLine(j);
            Print(in i);
            Print(j);
        }
        static void Swap(ref int a, ref int b)//a = i, b = j
        {
            int temp = a;
            a = b;
            b = temp;
            //Console.WriteLine(a);
            //Console.WriteLine(b);
        }
        //out is similar to ref - changes made in func reflect back in calling code
        //the initial value is discarded
        //out variables MUST be initialized in the function
        static void Init(out int a, out int b)
        {
            //Console.WriteLine(a); //error
            a = 1234;
            b = 5678;
        }
        static void Print(in int i)
        {
            Console.WriteLine(i);
            //i = 100;//error -- in variables are read only
        }

    }

    public class Class1
    {
        public int i;
    }

}

namespace RefAndValueTypes3 //passing reference types
{
    class Program
    {
        static void Main()
        {
            Class1 o = new Class1();  
            o.i = 100;
            //DoSomething1(o);
            //DoSomething2(o);
            DoSomething3(ref o);
            Console.WriteLine(o.i);
            Console.ReadLine();
        }
        static void DoSomething1(Class1 obj)  //obj = o
        {
            //changes made in func (changing value of properties) is reflected in calling code o
            obj.i = 200;
        }
        static void DoSomething2(Class1 obj)  //obj = o
        {
            //changes made in func (obj pointing to some other block) is NOT reflected in calling code o
            obj = new Class1();
            obj.i = 200;
        }
        static void DoSomething3(ref Class1 obj)  //obj = o
        {
            //changes made in func (obj pointing to some other block) is reflected in calling code o
            obj = new Class1();
            obj.i = 200;
        }
    }
    public class Class1
    {
        public int i;
    }
}