import java.io.*;

class ByteStreamReadWriteDemo1
{
	public static void main(String args[]) throws IOException
	{
		File fin = new File("/home/etu-1/Documents/DAC-22/Programs/InputOutput/input.txt");

		if(!fin.exists())
		{
			System.out.println("File does not exists");
			return;
		}

		FileInputStream fis = new FileInputStream(fin);
		FileOutputStream fos = new FileOutputStream("/home/etu-1/Documents/DAC-22/Programs/InputOutput/target.txt"); 

		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		//read() : returns integer value of the read byte from the file input stream.
		int ch;
		while((ch=bis.read()) != -1)
		{
			System.out.print((char)ch);
			bos.write(ch);
		}	
		bis.close();
		bos.flush();
		bos.close();
		System.out.println("File copied successfully to target.txt!!");
	}
		
}
