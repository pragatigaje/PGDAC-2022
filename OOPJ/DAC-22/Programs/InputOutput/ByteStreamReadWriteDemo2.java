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
		byte arr[] = new byte[8];
		while(bis.available() > arr.length && (ch=bis.read(arr)) != -1)
		{
			bos.write(arr);
		}	

		while((ch=bis.read()) != -1)
		{
			bos.write(ch);
		}	

		bis.close();
		bos.flush();
		bos.close();
		System.out.println("File copied successfully to target.txt!!");
	}
		
}
