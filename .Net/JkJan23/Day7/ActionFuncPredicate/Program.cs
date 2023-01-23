namespace ActionFuncPredicate
{
    internal class Program
    {
        static void Main1()
        {
            Action o1 = Display;
            o1();

            Action<string> o2 = Display;
            o2("aaa");
            
            Action<string,int> o3 = Display;
            o3("bbb", 1);

        }
        static void Main()
        {
            Func<string> o1 = GetCurrentTime;
            Console.WriteLine(o1());

            Func<int, int> o2 = GetDouble;
            Console.WriteLine(o2(10));

            Func<int, int, int> o3 = Add;
            Console.WriteLine(o3(10,20));

            Func<int, bool> o4 = IsEven;
            Console.WriteLine(o4(20));

            Predicate<int> o5 = IsEven; ;
            Console.WriteLine(o5(20));
        }


        static void Display()
        {
            Console.WriteLine("Display");
        }
        static void Display(string s)
        {
            Console.WriteLine("Display"+ s);
        }
        static void Display(string s,int i)
        {
            Console.WriteLine("Display" + s+ i);
        }

        static string GetCurrentTime()
        {
            return System.DateTime.Now.ToLongTimeString();
        }
        static int GetDouble(int a)
        {
            return a * 2;
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