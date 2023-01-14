namespace InterfaceDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ClassImpl obj = new ClassImpl();
            obj.Greet("Pragati");
            obj.Hello("Pooja");
            obj.Invite("Prachi");


            
            IAmInterf2 interf2= new ClassImpl();
            interf2.Hello("Pragati");
            
        }
    }

    public interface IAmInterf1
    {
        public void Hello(String name);
        public void Greet(String name);

    }

    public interface IAmInterf2
    {
        public void Hello(String name);

        public void Invite(String name);

    }

    public class ClassImpl : IAmInterf1 , IAmInterf2
    {
        public void Greet(String name)
        {
            Console.WriteLine("Good Morning "+name+" from IAmInter1");
        }

        public void Hello(String name)
        {
            Console.WriteLine("Hello " + name + " from IAmInter1");
        }

        void IAmInterf2.Hello(String name)
        {
            Console.WriteLine("Hello " + name + " from IAmInter2");
        }

        public void Invite(string name)
        {
            Console.WriteLine("Welcome " + name + " from IAmInter2");
        }
    }
}