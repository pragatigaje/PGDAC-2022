import java.io.*;
import java.util.*;

class FileClassDemo
{
	public static void main(String args[])
	{
		File f = new File("/home/etu-1/Documents/DAC-22/Programs/dummydir");

		//exists() method
		if(f.exists())
		{
			System.out.println("exists");
		}
		else
		{
			System.out.println("does not exist");
		}


		//isDirectory() method
		if(f.isDirectory())
		{
			System.out.println("It is a directory and files inside this directory are :");

			//list() method -- returns an array of file names
			String filenames[] = f.list();
			System.out.println(Arrays.toString(filenames));

			//listFiles() method -- returns an array of File objects
			File fileObj[] = f.listFiles();

			for(File fl : fileObj)
			{
				//getName() method 
				if(fl.isDirectory())
				{
					System.out.println(fl.getName() + " is a directory");
				}
				else
				{
					System.out.println(fl.getName() + " is a file");
				}
			}
		}
		if(f.isFile())
		{
			System.out.println("It is a file");
		}


	}
}
