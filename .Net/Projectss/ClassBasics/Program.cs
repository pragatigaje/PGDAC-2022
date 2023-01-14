namespace ClassBasics
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Console.WriteLine("Hello, World!");
            System.Console.WriteLine("Hello Pragati from System");

        }

        static void Main(string[] args)
        {
            Class1 o = new Class1();
            o.Display();
        }
    }

    public class Class1
    { 
        public void Display ()
            {
                Console.WriteLine("Hello from class1 display");
            }
    }
}