import java.io.*;

class Demo implements Serializable
{
	int a;
	String s;
	double d;

	Demo()
	{
	}

	Demo(int a, String s, double d)
	{
		this.a = a;
		this.s = s;
		this.d = d;
	}

	public String toString()
	{
		return "Demo[a = " + a + ", s = " + s + ", d = " + d + "]";
	}
}

class DeserializationDemo
{
	public static void main(String args[]) throws IOException,ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream("myobjets.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo d = (Demo)ois.readObject();

		ois.close();
		System.out.println("Object of class Demo deserialized from the secondary storage successfully");
		System.out.println("Object state : " + d);
	}
}
