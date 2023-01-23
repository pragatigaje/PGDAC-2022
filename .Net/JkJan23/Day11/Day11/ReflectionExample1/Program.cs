using System.Reflection;

namespace ReflectionExample1
{
    internal class Program
    {
        static void Main()
        {
            //D:\Trainings\JkJan23\Day1\ClassBasics\bin\Debug\net6.0\ClassBasics.dll
            Assembly assembly = Assembly.LoadFile(@"D:\Trainings\JkJan23\Day1\ClassBasics\bin\Debug\net6.0\ClassBasics.dll");
            //Console.WriteLine(assembly.FullName);
            Console.WriteLine(assembly.GetName().Name);

            Type[] arrTypes = assembly.GetTypes();
            foreach (Type t in arrTypes)
            {
                Console.WriteLine("   "+ t.Name);
                MethodInfo[] arrMethods = t.GetMethods();
                foreach (MethodInfo m in arrMethods)
                {
                    Console.WriteLine("       "+ m.Name);
                }

            }

        }
    }


    //asm1 - asm2 - asm3 - asm4
}