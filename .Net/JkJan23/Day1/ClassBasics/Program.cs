//using System; //for current file
global using System;  //for whole project

namespace ClassBasics
{
    internal class Program
    {
        static void Main1()
        {

            //System.Console.WriteLine("");
            System.Console.WriteLine("H w");
            Console.WriteLine("Hello, World!");
            //n1.n1a.Class1
        }
        static void Main()
        {
            //Class1 o;  //o is reference of type Class1
            //o = new Class1(); //new Class1() is an object
            //o refers to the object created (new Class1());

            Class1 o = new Class1();
            o.Display();
            o.Display("hello");

            Console.WriteLine(o.Add());
            Console.WriteLine(o.Add(10));
            Console.WriteLine(o.Add(10, 20));
            Console.WriteLine(o.Add(10, 20, 30));//positional parameters

            Console.WriteLine(o.Add(a: 10, b: 20, c: 30));//named parameters
            Console.WriteLine(o.Add(c: 10, a: 20, b: 30));//named parameters
            Console.WriteLine(o.Add(c: 10));//named parameters

            o.DoSomething();
        }
    }

    public class Class1 //: Object
    {
        public void Display()
        {
            Console.WriteLine("display...");
        }
        public void Display(string s)
        {
            Console.WriteLine("display..." + s);
        }

        //public int Add(int a, int b)
        //{
        //    return a + b;
        //}
        //public int Add(int a, int b, int c)
        //{
        //    return a + b+c;
        //}

        //optional paramters with a default value
        public int Add(int a=0, int b=0, int c=0)
        {
            return a + b + c;
        }

        public void DoSomething()
        {
            int i = 100;
            Console.WriteLine("ds");
            DoSomethingElse();
            DoSomethingElse2();

            //local function
            //can be called only from within defining func

            //implicitly private
            void DoSomethingElse()
            {
                Console.WriteLine("dse");
                //local func can access a variable declared in calling function(outer func)
                Console.WriteLine(i);
            }

            static void DoSomethingElse2()
            {
                Console.WriteLine("dse");
                //static local func CANNOT access a variable declared in calling function(outer func)
                //Console.WriteLine(i);
            }
        }
    }


    namespace n2
    {

    }

}

namespace n1
{
    namespace n1a
    {
        public class Class1 { }
    }
}