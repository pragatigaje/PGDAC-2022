import java.io.*;

class BytesStreamRW
{
	public static void main(String args[]) throws IOException
	{
		File fin = new File("C:\\Users\\HP\\Desktop\\OOPJ\\Day 17\\io.txt");
		File fout = new File("C:\\Users\\HP\\Desktop\\OOPJ\\Day 17\\target.txt");
		
		if (!fin.exists()) 
		{
			System.out.println("File does not exists");
			return;
		}
		
		FileInputStream fis = new FileInputStream(fin);
		FileOutputStream fos = new FileOutputStream(fout);
		int ch;
		while((ch=fis.read()) != -1)
		{
			System.out.print(ch);
			fos.write(ch);
		}
		fis.close();
		fos.close();
	}
}