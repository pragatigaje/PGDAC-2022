using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace Delegates
{
    internal class ActionFuncPredicate
    {
        static void Main1()
        {
            Action a1 = Display;
            a1();

            Action<string> a2 = Display;
            a2(" Pragati");

            Action<string,int> a3 = Display;
            a3(" Pragati ", 5);
        }

        static void Main2()
        {
            Func<string> f1 = GetCurrentTime ;
            Console.WriteLine(f1());

            Func<int,int> f2 = GetDouble ;
            Console.WriteLine(f2(10));

            Func<int, int, int> f3 = Add;
            Console.WriteLine(f3(10, 123));

            Func<int,bool> f4 = IsEven;
            Console.WriteLine(f4(123));

        }

        static void Main()
        {
            Predicate<int> p1 = IsEven;
            Console.WriteLine(p1(101));
        }

        static void Display()
        {
            Console.WriteLine("Display");
        }
        static void Display(string s)
        {
            Console.WriteLine("Display" + s);
        }
        static void Display(string s, int i)
        {
            Console.WriteLine("Display" + s + i);
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
