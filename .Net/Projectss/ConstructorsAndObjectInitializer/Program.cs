namespace ConstructorsAndObjectInitializer1
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Class1 o= new Class1(10,20,30);
            Console.WriteLine(o.P1);
            Console.WriteLine(o.P2);
            Console.WriteLine(o.P3);
        }

    }

    public class Class1
    {
        public int P1 { get; set; }
        public int P2 { get; set; }
        public int P3 { get; set; }

        public Class1(int P1, int P2, int P3)
        {
            this.P1= P1;
            this.P2= P2;
            this.P3= P3;
        }
    }
}

namespace ConstructorsAndObjectInitializer2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Class1 o = new Class1 {P1=101,  P2=102, P3=103};
            Console.WriteLine("from object initializer");
            Console.WriteLine(o.P1);
            Console.WriteLine(o.P2);
            Console.WriteLine(o.P3);
        }

    }

    public class Class1
    {
        public int P1 { get; set; }
        public int P2 { get; set; }
        public int P3 { get; set; }

    }
}
