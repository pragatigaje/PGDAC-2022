namespace Delegates
{
    internal class DelegatesDemo
    {
        public delegate void Del1();
        public delegate int Del2(int a , int b);
        static void Main1(string[] args)
        {
            Del1 objDel = new Del1(Display);
            objDel += Show;

            objDel += Display;

            objDel += Show;

            objDel();
        }

        static void Main2(string[] args)
        {
            Del1 objDel2;
            objDel2 = (Del1)Delegate.Combine(new Del1(Display),new Del1(Show));
            objDel2();
        }
        static void Main3(string[] args)
        {
            Del2 objDel3 = Add;
            int ans = objDel3(5, 6);
            Console.WriteLine("The answer is : " + ans);            
        }
        static void Main4(string[] args)
        {
            Del2 objDel4 = Add;
            objDel4 += Substract;
            int ans = objDel4(5, 6);
            Console.WriteLine("The answer is : " + ans);
        }

        static void Main5(string[] args)
        {
            Del1 objDel4 = Class1.nonStaticDisplay;
            //objDel4();

            Class1 obj = new Class1();
            objDel4 = obj.nonStaticShow;

            objDel4();
        }

        static void Main6(string[] args)
        {

        }

        public static void Display()
        {
            Console.WriteLine("Display!");
        }

        public static void Show()
        {
            Console.WriteLine("Show!");
        }
    
        public static int Add(int a, int b)
        {
            return a + b;
        }
        public static int Substract(int a, int b)
        {
            return a - b;
        }
    }

    public class Class1
    {
        public static void nonStaticDisplay()
        {
            Console.WriteLine("NonStatic Display!");
        }

        public void nonStaticShow()
        {
            Console.WriteLine("NonStatic Show!");
        }
    }

}