import java.io.*;

class ReadFromConsoleDemo
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		System.out.println("Enter a number: ");
		String strInput = br.readLine();

		int num = Integer.parseInt(strInput);

		System.out.println("Enter a float value: ");
		strInput = br.readLine();

		double dval = Double.parseDouble(strInput);


		System.out.println("Enter a name: ");
		strInput = br.readLine();

		String name = strInput;

		
		System.out.println("Enter a boolean value: ");
		strInput = br.readLine();

		boolean bval = Boolean.parseBoolean(strInput);

		br.close();

		System.out.println("The input values are as below: ");
		System.out.println(num);
		System.out.println(dval);
		System.out.println(name);
		System.out.println(bval);


	}
}
