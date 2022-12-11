class RefVar
{
	int x =10;
	
      public static void main(String[] args)
    {
		RefVar d1 = new RefVar();
		RefVar d2 = d1;
		
		d2.x=15;
		System.out.println(d1.x); 
		
    }
}