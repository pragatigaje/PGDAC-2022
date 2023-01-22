using System.Diagnostics;
using System.Reflection;
namespace ReflectionExample
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Assembly assembly = Assembly.LoadFile("C:\\Users\\HP\\Desktop\\DAC-SEP -22\\.Net\\Projectss\\ClassBasics\\bin\\Debug\\net6.0\\ClassBasics.dll");
            Console.WriteLine(assembly.FullName);
        
        }
    }
}