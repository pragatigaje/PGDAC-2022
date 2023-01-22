/*
namespace EventHandling1
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Class1 objclass1= new Class1();
            objclass1.InvalidP1 += Objclass1_InvalidP1;
            objclass1.P1= 1;
        }
        static void Main2(string[] args)
        {
            Class1 objclass1 = new Class1();
            objclass1.InvalidP1 += Objclass1_InvalidP1;
        }

        static void Objclass1_InvalidP1()
        {
            Console.WriteLine("Event Handling Code ");
        }
    }

    //create a delegate class 
    public delegate void InvalidP1EventHandler();
    public class Class1
    {
        //create object (event)
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
                if (p1 > 100)
                    p1 = value;
                else
                    //step 3 : raise the click event
                    InvalidP1();
            }
        }
    }
}
*/
namespace EventHandling2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Class1 objclass1 = new Class1();
            objclass1.InvalidP1 += Objclass1_InvalidP11;
            objclass1.P1= 10;
        }

        private static void Objclass1_InvalidP11(int InvalidValue)
        {
            Console.WriteLine("Event Handling Code : Invalid Value enetred - "+InvalidValue);
        }

    }

    //create a delegate class 
    public delegate void InvalidP1EventHandler(int InvalidValue);
    public class Class1
    {
        //create object (event)
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
                if (p1 > 100)
                    p1 = value;
                else
                    //step 3 : raise the click event
                    InvalidP1(value);
            }
        }
    }
}