namespace Delegates
{
    //step 1 : create a delegate class having the same signature as the function to be called
    public delegate void Del1();
    public delegate int Del2(int a, int b);
    internal class Program
    {
        static void Main1()
        {

            //step 2 : create a object of the delegate class and pass function to call (function  name)
            //as parameter
            Del1 objDel = new Del1(Display);
            
            //step 3: call the function via the delegate reference
            objDel();
        }
        static void Main2()
        {
            Del1 objDel = Display;
            objDel();
        }
        static void Main3()
        {
            Del1 objDel = Display;
            objDel();
            Console.WriteLine();
            objDel = Show;
            objDel();
        }
        static void Main4()
        {
            Del1 objDel = Display;
            objDel();

            Console.WriteLine();
            objDel += Show;
            objDel();

            Console.WriteLine();
            objDel += Display;
            objDel();

            Console.WriteLine();
            objDel -= Display;
            objDel();

        }
        static void Main5()
        {
            Del1 objDel = (Del1)Delegate.Combine(new Del1(Display), new Del1(Show), new Del1(Display));
            objDel();

            Console.WriteLine();
            //objDel = (Del1)Delegate.Remove(objDel, new Del1(Display));
            objDel = (Del1)Delegate.RemoveAll(objDel, new Del1(Display));
            objDel();

        }
        static void Main6()
        {
            Del2 objDel2 = Add;
            int ans = objDel2(1, 2);
            Console.WriteLine(ans);

            Console.WriteLine(objDel2(10,20));
        }
        static void Main7()
        {
            Del1 objDel1 = Class1.Display;
            objDel1();

            Class1 obj = new Class1();
            objDel1 = obj.Show;
            objDel1();

        }
        static void Display()
        {
            Console.WriteLine("Display");
        }
        static void Show()
        {
            Console.WriteLine("Show");
        }
        static int Add(int a, int b)
        {
            return a + b;
        }
        static int Subtract(int a, int b)
        {
            return a - b;
        }
    }

    public class Class1
    {
        public static void Display()
        {
            Console.WriteLine("Display");
        }
        public void Show()
        {
            Console.WriteLine("Show");
        }
    }
}