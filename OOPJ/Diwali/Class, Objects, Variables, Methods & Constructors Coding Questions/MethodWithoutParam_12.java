//12. Java Program to Create a Method without Parameters and with Return Type
import java.util.*;
class Test {
    double areaCircle() {   
        System.out.print("enter the radius :");
        Scanner s = new Scanner(System.in);
        float r = s.nextFloat();
        float ar;
        ar = (r * r) * 22 / 7;
		return ar;
        
    }
}
class MethodWithoutParam_12 {
    public static void main(String args[])  {
        Test obj = new Test();
       
		System.out.println("area of the circle is : " + obj.areaCircle());
    }
}