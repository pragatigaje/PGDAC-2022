namespace ExceptionHandling2
{
    class Program
    {
        static void Main()
        {
            Class1 obj = new Class1();
            try
            {
                int x = Convert.ToInt32(Console.ReadLine());
                obj.P1 = x;
                Console.WriteLine(obj.P1);
                Console.WriteLine("No Exceptions");
            }
            catch (FormatException ex)
            {
                Console.WriteLine("FormatException occurred");
            }
            catch (NullReferenceException ex)
            {
                Console.WriteLine("NRException occurred");
            }
            catch (InvalidP1Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            catch (SystemException ex) //all unhandled .net exceptions
            {
                Console.WriteLine(ex.Message);
            }
            catch (ApplicationException ex) //all unhandled user defined exceptions
            {
                Console.WriteLine(ex.Message);
            }
            catch (Exception ex)// all other unhandled exceptions
            {
                Console.WriteLine(ex.Message);
            }
            Console.ReadLine();
        }
    }

    public class Class1
    {
        private int p1;
        public int P1
        {
            get
            {
                return p1;
            }
            set
            {
                if (value < 100)
                    p1 = value;
                else
                {
                    //Exception ex = new Exception();
                    //throw ex;
                    //throw new Exception();
                    //throw new Exception("Invalid p1");

                    //throw new InvalidP1Exception();
                    throw new InvalidP1Exception("Invalid P1");

                }
            }
        }
    }

    public class InvalidP1Exception :ApplicationException //:Exception
    {
        public InvalidP1Exception(string message) : base(message)
        {
        }
    }




}
