import java.io.*;

class CharStreamReadWriteDemo
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

		FileReader fr = new FileReader(fin);
		//FileWriter fw = new FileWriter(fout,true); //will append the content to the file.
		FileWriter fw = new FileWriter(fout); //will always create a new file

		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);

		//read() : returns integer value of the read byte from the file input stream.
		int ch;
		while((ch=br.read()) != -1)
		{
			System.out.print((char)ch);
			bw.write(ch);
		}	
		br.close();
		bw.flush();
		bw.close();
		System.out.println("File copied successfully to target.txt!!");
	}
		
}
