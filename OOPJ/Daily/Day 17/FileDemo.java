import java.io.*;
import java.util.*;


class FileDemo
{
	public static void main(String args[])
	{
		File f = new File("C:\\Users\\HP\\Desktop\\OOPJ\\Assignment");
		
		if(f.exists())
		{
			System.out.println("exits");
		}
		if (f.isDirectory())
		{
			System.out.println("It is directory");
			//String filenames[] = f.list();
			//System.out.println(Arrays.toString(filenames));
			System.out.println(Arrays.toString(f.list()));
		}
		else
		{
			System.out.println("It is not directory");
		}
		
		File fobj[] = f.listFiles();
			
			for (File fl : fobj)
			{
				if ( fl.isDirectory())
					System.out.println(fl.getName()+" is directory");
				else
					System.out.println(fl.getName()+" is file");
			}}
}