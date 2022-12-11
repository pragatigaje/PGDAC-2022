//************ 1. Java Program to Illustrate Use of All Features of Abstract Class
//************ 2. Java Program to Illustrates Use of Abstract Class and Method

abstract class Demo
{
	int a,b;
	Demo()
	{
		
	}
	abstract void Fun1(int a, int b);
	
	void Fun2()
	{ 
		System.out.println("SOP Fun2");                //SOP Fun2
	}
}
class First extends Demo{
	void Fun1(int a , int b)
	{
		int res= a+b;
		System.out.println("Addition is : "+res);      //Addition is : 80
	}
}
class UseOfAbstractClass_1
{
	public static void main(String args[]){
		First f= new First();
		f.Fun1(20,60);
		f.Fun2();
		//Demo d=new Demo();    //error: we cannot create object of abstract class
	}
}