import java.io.*;

class ByteStreamReadWriteDemo
{
	public static void main(String args[]) throws IOException
	{
		File fin = new File("/home/etu-1/Documents/DAC-22/Programs/InputOutput/input.txt");
		File fout = new File("/home/etu-1/Documents/DAC-22/Programs/InputOutput/target.txt");

		if(!fin.exists())
		{
			System.out.println("File does not exists");
			return;
		}

		FileInputStream fis = new FileInputStream(fin);
		FileOutputStream fos = new FileOutputStream(fout,true); //will append the content to the file.
		//FileOutputStream fos = new FileOutputStream(fout); //will always create a new file

		//read() : returns integer value of the read byte from the file input stream.
		int ch;
		while((ch=fis.read()) != -1)
		{
			System.out.print((char)ch);
			fos.write(ch);
		}	
		fis.close();
		fos.close();
		System.out.println("File copied successfully to target.txt!!");
	}
		
}
