//16. Java Program to Illustrate Use of Final Keyword

//If you make any class as final, you cannot extend it.
class UseOfFinal_16{  
   //If you make any variable as final, you cannot change the value of final variable
   final int speedlimit=90;          //final variable  
   
   void run(){  
        speedlimit=400;              //error: canot assign value to final var
    } 
	
	//If you make any method as final, you cannot override it.
	final void run(){
		System.out.println("running");
	}  
	
   public static void main(String args[]){  
   UseOfFinal_16 obj=new  UseOfFinal_16();  
   obj.run();  
   }  
}