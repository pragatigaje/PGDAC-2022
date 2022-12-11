import java.util.*;
class Break{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	aa:  
		for(int i=1;i<=3;i++)
		{    
			bb:  
				for(int j=1;j<=3;j++)
				{    
					if(i==2&&j==2)
					{    
						break aa;    
                    }    
                    System.out.println(i+" "+j);    
				}    
		}  
	
	
	
	/*
	for(int i=1;i<=3;i++)
	{    
        for(int j=1;j<=3;j++)
		{    
            if(i==2 && j==2)
			{    
				break;    
			}    
            System.out.println(i+" "+j);    
		}    
	}  
	*/	
		
	}

}