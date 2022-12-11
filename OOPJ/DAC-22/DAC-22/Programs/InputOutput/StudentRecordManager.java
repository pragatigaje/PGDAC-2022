import java.io.*;
import java.util.*;

class Student
{
	int roll;
	String name;
	double marks;

	Student()
	{
	}

	Student(int roll, String name, double marks)
	{
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public String toString()
	{
		return "Student[roll = " + roll + ", name = " + name + ", marks = " + marks + "]";
	}
}

class StudentRecordManager 
{
	public static void main(String args[]) throws IOException
	{
		File fin = new File("/home/etu-1/Documents/DAC-22/Programs/InputOutput/input.txt");

		if(!fin.exists())
		{
			System.out.println("File does not exists");
			return;
		}

		FileReader fr = new FileReader(fin);
		BufferedReader br = new BufferedReader(fr);

		//List for storing Student objects
		//List<Student> studList = new ArrayList<>();
		List<Student> studList = new LinkedList<>();
		
		String line;
		while((line = br.readLine()) != null)
		{
			line = line.trim();
			
			if(line.equals(""))
				continue;
				
			String str[] = line.split(",");

			int roll = Integer.parseInt(str[0]);
			String name = str[1];
			double marks = Double.parseDouble(str[2]);
			
			 //create Student object
                        Student s = new Student(roll,name,marks);
                        studList.add(s);

		}	
		br.close();
		System.out.println("List created successfully!!");
		System.out.println("List elements: ");
	
			
		for(Student s : studList)
		{
			System.out.println(s);
		} 
	}
		
}
