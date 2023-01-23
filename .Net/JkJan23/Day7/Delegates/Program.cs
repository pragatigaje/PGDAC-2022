namespace Delegates
{
    public delegate int Del2(int a, int b);

    internal class Program
    {
        static void Main()
        {
            Console.WriteLine(PassFunctionAsAParameter(Add,20,10));
            Console.WriteLine(PassFunctionAsAParameter(Subtract,5,1));
        }

        //func to call is passed as a parameter
        static int PassFunctionAsAParameter(Del2 objDel2,int a, int b) //objDel2 = Add
        {
            return objDel2(a, b);
        }
        static int Add(int a, int b)
        {
            return a + b;
        }
        static int Subtract(int a, int b)
        {
            return a - b;
        }
    }
}
//D:\Trainings\JkJan23\Day7\Day7.sln