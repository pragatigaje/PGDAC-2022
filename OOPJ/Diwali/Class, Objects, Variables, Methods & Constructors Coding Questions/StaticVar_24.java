//24. Java Program to Demonstrate Usage of a Static Variable in the Test Class

public class StaticVar_24 {
    static int x = 17;
    public static void main(String args[]) {
		
		//statc var can be accessed from static content
		//No need to create object to access static var but if create obj , that is also fine
        System.out.println(x);                          //17
        StaticVar_24 ob = new StaticVar_24();
        System.out.println(ob.x);                     //17
    }
}