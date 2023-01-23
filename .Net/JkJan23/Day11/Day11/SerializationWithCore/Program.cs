using System.Runtime.Serialization.Formatters.Binary;
using System.Runtime.Serialization.Formatters.Soap;

namespace SerializationWithCore
{
    internal class Program
    {
        static void Main()
        {
            //BinarySerialization();
            //BinaryDeSerialization();
            SoapSerialization();
            SoapDeSerialization();
        }

        static void BinarySerialization()
        {
            Class1 o = new Class1();
            o.i = 100;
            o.P1 = "aaa";
            o.P2 = 200;
            BinaryFormatter bf = new BinaryFormatter();
            Stream s = new FileStream("C:\\o.dat", FileMode.Create);
#pragma warning disable SYSLIB0011 // Type or member is obsolete
            bf.Serialize(s, o);
#pragma warning restore SYSLIB0011 // Type or member is obsolete
            s.Close();
        }
        static void BinaryDeSerialization()
        {
            BinaryFormatter bf = new BinaryFormatter();
            Stream s = new FileStream("C:\\o.dat", FileMode.Open);
#pragma warning disable SYSLIB0011 // Type or member is obsolete
            Class1 o = (Class1)bf.Deserialize(s);
#pragma warning restore SYSLIB0011 // Type or member is obsolete
            s.Close();
            Console.WriteLine(o.i);
            Console.WriteLine(o.P1);
            Console.WriteLine(o.P2.ToString());
        }

        static void SoapSerialization()
        {
            Class1 o = new Class1();
            o.i = 100;
            o.P1 = "aaa";
            o.P2 = 200;
            SoapFormatter sf = new SoapFormatter();
            Stream s = new FileStream("C:\\o.soap", FileMode.Create);
            sf.Serialize(s, o);
            s.Close();
        }
        static void SoapDeSerialization()
        {
            SoapFormatter sf = new SoapFormatter();
            Stream s = new FileStream("C:\\o.soap", FileMode.Open);
            Class1 o = (Class1)sf.Deserialize(s);
            s.Close();
            Console.WriteLine(o.i);
            Console.WriteLine(o.P1);
            Console.WriteLine(o.P2.ToString());
        }
    }
}