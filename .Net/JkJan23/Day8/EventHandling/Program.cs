namespace EventHandling1
{
    internal class Program
    {
        //static void Main(string[] args)
        //{
        //    Class1 objClass1 = new Class1();
        //    objClass1.InvalidP1 += objClass1_InvalidP1;
        //    objClass1.P1 = 1000;
        //}
        //static void objClass1_InvalidP1()
        //{
        //    Console.WriteLine("event handling code.....");
        //}
        static void Main1()
        {
            Class1 obj = new Class1();
            obj.InvalidP1 += Obj_InvalidP1;
            obj.InvalidP1 += Handler2;
            obj.P1 = 1234;

            Console.WriteLine();
            obj.InvalidP1 -= Handler2;
            obj.P1 = 1234;

            Console.WriteLine();
            obj.InvalidP1 -= Obj_InvalidP1;
            obj.P1 = 1234;

        }

        private static void Obj_InvalidP1()
        {
            Console.WriteLine("event handled here");
        }
        private static void Handler2()
        {
            Console.WriteLine("event handled here too - handler2");
        }
    }
    //step 1 : create a delegate class having the same signature as the event
    public delegate void InvalidP1EventHandler();
    public class Class1
    {
        //step 2: create a delegate object (event)
        public event InvalidP1EventHandler InvalidP1;
        private int p1;
        public int P1
        {
            get
            {
                return p1;
            }
            set
            {
                if (value < 100)
                    p1 = value;
                else
                {
                    //step 3 : raise the event ( call delegate object)
                    if(InvalidP1!= null)
                        InvalidP1();
                    
                }
            }
        }
    }
}

namespace EventHandling2
{
    internal class Program
    {

        static void Main()
        {
            Class1 obj = new Class1();
            obj.InvalidP1 += Obj_InvalidP1;

            obj.P1 = 1234;
        }

        private static void Obj_InvalidP1(int InvalidValue)
        {
            Console.WriteLine("event raised. invalid value is " + InvalidValue);
        }
    }
    //step 1 : create a delegate class having the same signature as the event
    public delegate void InvalidP1EventHandler(int InvalidValue);
    public class Class1
    {
        //step 2: create a delegate object (event)
        public event InvalidP1EventHandler InvalidP1;
        private int p1;
        public int P1
        {
            get
            {
                return p1;
            }
            set
            {
                if (value < 100)
                    p1 = value;
                else
                {
                    //step 3 : raise the event ( call delegate object)
                    if (InvalidP1 != null)
                        InvalidP1(value);

                }
            }
        }
    }
}