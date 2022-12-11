class Student
{
	int roll;
	double marks;
	
	Student()
	{
	}
	Student(int roll,double marks)
	{
		this.roll=roll;
		this.marks=marks;
	}
	public String toString()
	{
		return "Student[roll = " + roll + " marks = " + marks + "]";
	}

	public int hashCode()
	{

		return (int) (roll+marks);
	}

}

class MyGen<T1,T2> extends Student
{
	T1 ob1;
	T2 ob2;
	
	void setOb1(T1 i)
	{
		ob1=i;
	}
	
	T1 getOb1()
	{
		return ob1;
	}
	
	void setOb2(T2 d)
	{
		ob2=d;
	}
	
	T2 getOb2()
	{	
		return ob2;
	}
}
class P37{

public static void main(String[]args){

MyGen<Integer,Double> mg1 = new MyGen<Integer,Double>();
mg1.setOb1(10);
mg1.setOb2(65.0);

int i = (Integer)mg1.getOb1();
double d = (Double)mg1.getOb2();

System.out.println(i);
System.out.println(d);

MyGen<Integer,Student> mg2 = new MyGen<Integer,Student>();
mg2.setOb1(1);
mg2.setOb2(new Student(2,87.5));

System.out.println(mg2.getOb1());
System.out.println(mg2.getOb2());
}
}