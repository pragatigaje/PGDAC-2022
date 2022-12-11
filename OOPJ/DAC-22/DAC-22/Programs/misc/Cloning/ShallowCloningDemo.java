class Demo
{
	int b;
	Demo()
	{
	}
	
	Demo(int b)
	{
		this.b = b;
	}
	
	public String toString()
	{
		return "Demo[b = " + b + "]";
	}
}

class First implements Cloneable
{
	int a;
    	Demo d;

        First()
        {
        }
        
        First(int a, Demo d)
        {
                this.a = a;
                this.d = d;
        }

	public First clone() throws CloneNotSupportedException
	{
		First f = (First)super.clone();	//Will create a clone of the First object and will return itst reference
		return f;
	}

        public String toString()
        {
                return "First[a = " + a + ", " + d + "]";
        }
}

class ShallowCloningDemo
{
        public static void main(String args[]) throws CloneNotSupportedException 
        {
                Demo d1 = new Demo(10);
                First f1 = new First(5,d1);

                //First f2 = f1;		//Does not create any copy of the object here.
                First f2 = f1.clone();		
                f2.a = 15;
                f2.d.b = 25;
                
                System.out.println("f1 = " + f1);
                System.out.println("f2 = " + f2);

        }
}

