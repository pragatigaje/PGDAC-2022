namespace AnonMethodsAndLambdas1
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            int i = 100;
            Action o1 = delegate()
            {
                Console.WriteLine(i);
                Console.WriteLine("anon method");
            };

            o1();

            Func<int, int, int> o2 = delegate (int a, int b)
            {
                return a + b;
            };
            Console.WriteLine(o2(10,20));
        }
        
    }
}

namespace AnonMethodsAndLambdas2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //function
            Func<int, int> o1 = GetDouble;
            Console.WriteLine(o1(10));

            //anonymous method
            Func<int, int> o2 = delegate(int a)
            {
                return a * 2;
            };
            Console.WriteLine(o2(10));

            //lambda
            //Func<int, int> o3 = (a) => a * 2;
            Func<int, int> o3 = a => a * 2;
            Console.WriteLine(o3(10));

            Func<string> o4 = () => System.DateTime.Now.ToLongTimeString();
            Console.WriteLine(o4());

            Func<int,int,int> o5 = (a,b) => a + b;
            Console.WriteLine(o5(10,20));

            Func<int, bool> o6 = a =>
            {
                if (a % 2 == 0)
                    return true;
                else
                    return false;
            };
            Console.WriteLine(o6(10));

            Func<int, bool> o7 = a => a % 2 == 0;
            Console.WriteLine(o7(10));  

        }
        static int GetDouble(int a)
        {
            return a * 2;
        }
        static string GetCurrentTime()
        {
            return System.DateTime.Now.ToLongTimeString();
        }
        static int Add(int a, int b)
        {
            return a + b;
        }
        static bool IsEven(int a)
        {
            if (a % 2 == 0)
                return true;
            else
                return false;
        }
    }

}