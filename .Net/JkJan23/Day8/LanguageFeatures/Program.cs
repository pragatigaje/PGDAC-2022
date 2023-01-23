namespace ImplicitVariables
{
    //implicit variables
    internal class Program
    {
        static void Main1(string[] args)
        {
            //int i = 0; 
            var i = 0;

            //implicit variables
            //used only for local variables
            //cant be used for class level vars,fn params and return types

            Console.WriteLine(i);
            Console.WriteLine(i.GetType());
        }
    }
}
namespace AnonymousTypes
{
    //anonymous types
    internal class Program
    {
        static void Main2()
        {
            //Class1 o = new Class1{a=10,b="aaa",c=1.2};
            var o = new { Id = 10, Name = "aaa", Salary = 1.2, IsRetired = false };
            var o2 = new { Id = 11, Name = "bbb", Salary = 3.2, IsRetired = true };
            Console.WriteLine(o.Id);
            Console.WriteLine(o.GetType());
            Console.WriteLine(o2.GetType());
        }
    }
}

namespace PartialClasses
{
    //PARTIAL CLASSES
    //partial classes must be in the same assembly
    //partial classes must be in the same namespace
    //partial classes must have the same name
    public partial class Class1
    {
        public int i;
    }
    public partial class Class1
    {
        public int j;
    }
    public class Program
    {
        public static void Main3()
        {
            Class1 o = new Class1();
            //o.
        }
    }
}
namespace PartialClasses
{
    public partial class Class1
    {
        public int k;
    }

}

namespace PartialMethods
{
    public class MainClass
    {
        public static void Main5()
        {
            Class1 o = new Class1();
            Console.WriteLine(o.Check());
            Console.ReadLine();
        }
    }
    //Partial methods can only be defined within a partial class.
    //Partial methods must return void.
    //Partial methods can be static or instance level.
    //Partial methods cannnot have out params
    //Partial methods are always implicitly private.
    public partial class Class1
    {
        private bool isValid = true;
        partial void Validate();
        public bool Check()
        {
            //.....
            Validate();
            return isValid;
        }
    }
    public partial class Class1
    {
        partial void Validate()
        {
            //perform some validation code here
            isValid = false;
        }
    }


}

namespace ExtensionMethods
{
    public class MainClass
    {
        public static void Main1()
        {
            int i = 100;
            i = i.Add(10);
            i.Display();
            i.ExtMethodForObjectClass();

            string s = "abcd";
            s.Show();
            s.ExtMethodForObjectClass();
        }
        public static void Main2()
        {
            int i = 100;
            i = Class1.Add(i, 10);
            Class1.Display(i);
        }

        static void Main()
        {
            ClsMaths objClsMaths = new ClsMaths();
            Console.WriteLine(objClsMaths.Add(10, 20));
            Console.WriteLine(objClsMaths.Multiply(10, 20));
            Console.WriteLine(objClsMaths.Subtract(10, 20));


        }
    }
    public static class Class1
    {
        public static int Add(this int i, int j)
        {
            return i + j;
        }

        //step 1 : create a static method in a static class
        //step 2: the 1st parameter of the extension method must the type for which
        //you are creating the extension method, preceded by the 'this' keyword 
        public static void Display(this int i)
        {
            Console.WriteLine(i);
        }
        public static void Show(this string s)
        {
            Console.WriteLine(s);
        }
        //if you define an ext method for the base class, it is also available for the derived class
        public static void ExtMethodForObjectClass(this object o)
        {
            Console.WriteLine(o);
        }

        //if you define an ext method for an interface, it is also available
        //for all the classes that implement that interface
        public static int Subtract(this IMathOperations o, int a, int b)
        {
            return a - b;
        }

    }
    public interface IMathOperations
    {
        int Add(int a, int b);
        int Multiply(int a, int b);
    }
    public class ClsMaths : IMathOperations
    {
        public int Add(int a, int b)
        {
            return a + b;
        }

        public int Multiply(int a, int b)
        {
            return a * b;
        }
    }
}