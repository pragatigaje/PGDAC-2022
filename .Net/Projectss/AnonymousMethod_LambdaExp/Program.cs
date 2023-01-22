namespace AnonymousMethod_LambdaExp
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Func<int,int> f1 = GetDouble;
            Console.WriteLine(f1(10));

            Func<String> f2 = GetCurrentTime;
            Console.WriteLine(f2());

            Func<int, int, int> f3 = Add;
            Console.WriteLine(f3(10,12));

            Func<int, bool> f4 = IsEven;
            Console.WriteLine(f4(56));
        }

        static void Main2(string[] args)
        {
            //Anonymous Function 

            Func<int, int> f1 = delegate (int a) { return a*2; };
            Console.WriteLine(f1(56));

            Func<String> f2 = delegate () { return System.DateTime.Now.ToLongTimeString(); };
            Console.WriteLine(f2());

            Func<int, int, int> f3 = delegate(int a, int b) { return a+b; };
            Console.WriteLine(f3(10, 12));

            Func<int, bool> f4 = delegate (int a) { return a % 2 == 0; };
            Console.WriteLine(f4(56));
        }

        static void Main(string[] args)
        {
            //Lambda Function
            Func<int, int> f1 = (int a) => { return a*2; };
            Console.WriteLine(f1(37));

            Func<String> f2 = () => System.DateTime.Now.ToLongTimeString();
            Console.WriteLine(f2());

            Func<int, int, int> f3 = (int a, int b) => a + b;
            Console.WriteLine(f3(10, 12));

            Func<int, bool> f4 =  a => a% 2 == 0;
            Console.WriteLine(f4(56));
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