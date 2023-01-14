namespace Properties2
{
    internal class Program
    {
        static void Main1()
        {
            Class1 obj = new Class1();
            obj.seti(100);
            Console.WriteLine(obj.geti());

        }

        static void Main()
        {
            Class2 obj2 = new Class2();
            obj2.P1 = 99;
            Console.WriteLine("From property :" + obj2.P1);
            Console.WriteLine("From property :" + obj2.NAME);
            obj2.S = 45;
            Console.WriteLine("From property :" + obj2.S);

        }


        public class Class1
        {
            private int i; //class variable

            public void seti(int value)
            {
                if (value < 100)
                    i = value;
                else
                    Console.WriteLine("Invalid i");
            }

            public int geti()
            {
                return i;
            }
        }

        public class Class2
        {
            private int p1;
            public int P1
            {
                set
                {
                    if (value < 100)
                        p1 = value;
                    else
                        Console.WriteLine("Invalid p1");
                }

                get { return p1; }
            }

            private string name = "Pragati";
            public string NAME
            { get { return name; } }

            public int S { set;get; }
        }
    }
}