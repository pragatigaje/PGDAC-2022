namespace ImplicitVariables
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            var j = 'a';
            Console.WriteLine(j);
            Console.WriteLine(j.GetType());
        }
    }
}

namespace AnonymousTypes
{
    public class Program
    {
        static void Main(string[] args)
        {
            Animal animal= new Animal();
            Console.WriteLine(animal.name);
            Console.WriteLine(animal.count);
            Console.WriteLine(animal.color);
        }
    }
    public partial class Animal
    {
        public String name = "Tiger";
    }

    public partial class Animal
    {
        public int count = 100;
    }
}