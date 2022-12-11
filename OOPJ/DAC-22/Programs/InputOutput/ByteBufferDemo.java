import java.io.*;
import java.nio.*;
import java.nio.channels.*;

class ByteBufferDemo
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream("input.txt");
		FileChannel fcin = fis.getChannel();
		ByteBuffer bb = ByteBuffer.allocate((int)fcin.size());
		fcin.read(bb);
		
		//Reading throgh the byte buffer and printing it to the console.
		bb.rewind();

		for(int i = 0; i < (int)fcin.size(); i++)
		{
			System.out.print((char)bb.get(i));
		}
		System.out.println();


		//Writing to the another file
		bb.rewind();
		FileOutputStream fos = new FileOutputStream("target.txt");
		FileChannel fcout = fos.getChannel();
		fcout.write(bb);
		
		fcin.close();
		fis.close();
		fcout.close();
		fos.flush();
		fos.close();


		System.out.println("File read successfully and copied to target.txt");
	}
}
