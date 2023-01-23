namespace StaticMembers
{
    internal class Program
    {
        static void Main()
        {
 
            Class1 o1;
            o1= new Class1();   
            Class1 o2 = new Class1();
            o1.i = 100;
            o2.i = 200;
            o1.Display();

            Class1.s_i = 1234;
            Class1.s_Display();
            Class1.sP1 = 10;

        }
    }

    public class Class1
    {
        public int i;
        public static int s_i; //single copy

        public void Display()
        {
            Console.WriteLine("display");
            Console.WriteLine(i);
            Console.WriteLine(s_i);
        }

        //can be called directly without creating an object of the class
        public static void s_Display()
        {
            Console.WriteLine("static display");
            //Console.WriteLine(i);
            Console.WriteLine(s_i);
        }

        private int p1;
        public int P1 //property
        {
            set
            {
                if (value < 100)
                    p1 = value;
                else
                    Console.WriteLine("invalid p1");
            }
            get
            {
                return p1;
            }
        }
        private static int sp1;
        public static int sP1 //property
        {
            set
            {
                if (value < 100)
                    sp1 = value;
                else
                    Console.WriteLine("invalid p1");
            }
            get
            {
                return sp1;
            }
        }
        public Class1()
        {
            Console.WriteLine("cons called");
        }
        static Class1()
        {
            Console.WriteLine("static cons called");
            s_i = 100;
            sP1 = 10;
        }
    }
}

//why property? - validations
//why static property? - single copy with validations

//why constructor? - to intialise data members
//why static constructor? - to intialise static data members
//when is the static constructor called? - when the class is loaded
//when is the class loaded? - either first object is created
//                            OR static member is accessed for the first time
//static constructor is implicitly called
//static constructor is parameterless
//static constructor cannot be overloaded
//static constructor is implicitly private

//static class
//can only contain static members
//cannot be instantiated
//cannot be used as a base class
