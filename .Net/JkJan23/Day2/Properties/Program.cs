namespace Properties1
{
    internal class Program
    {
        static void Main1()
        {
            int i;//local variable - unassigned
            i = 0;
            //Console.WriteLine(i);

            Class1 o = new Class1();
            //o.i = 1000;
            //Console.WriteLine(o.i);
            o.Seti(10);
            Console.WriteLine(o.Geti());

            o.j = ++o.j + o.j++ - --o.j - o.j--;

        }
    }
    //DO NOT EVER USE SETTERS AND GETTERS
    //INSTEAD USE A PROPERTY
    public class Class1
    {
        public int j;
        private int i;
        public void Seti(int VALUE)
        {
            if(VALUE <100)
                i = VALUE;
            else
                //throw new Exception(....
                Console.WriteLine("invalid i");
        }
        public int Geti()
        {
            return i;
        }
    }
}

namespace Properties2
{
    internal class Program
    {
        static void Main()
        {
            Class1 o = new Class1();
            o.P1 = 10000; //set
            Console.WriteLine(o.P1);  //get

            o.P2 = "aa";
            Console.WriteLine(o.P2);

            //o.P3 = "aaa";
            Console.WriteLine(o.P3);

            o.P5 = "aaaa";
            Console.WriteLine(o.P5);
            
        }
    }
    public class Class1a
    {
        public int j;
        private int i;
        public void Seti(int VALUE)
        {
            if (VALUE < 100)
                i = VALUE;
            else
                //throw new Exception(....
                Console.WriteLine("invalid i");
        }
        public int Geti()
        {
            return i;
        }
    }
    public class Class1
    {
        private int p1;
        public int P1 //property
        {
            set 
            { 
                if(value < 100)
                    p1 = value;
                else
                    Console.WriteLine("invalid p1");
            }
            get 
            { 
                return p1;
            }
        }
        private string p2;
        public string P2
        {
            set 
            {
                //if(value....)
                p2 = value;
            }
            get
            {
                return p2;
            }
        }
        private string p3="read only prop";
        public string P3
        {
            get
            {
                return p3;
            }
        }

        public string P4; //field (class level variable)

        //automatic property
        //no validations
        //compiler generates code for get/set
        //compiler generates a variable

        public string P5 { get; set; }
    }
}


    