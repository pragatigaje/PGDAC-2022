//13. Java Program to Create a Method without Parameters and Return Type
import java.util.*;
class Test {
    void  areaCircle() {   
        System.out.print("enter the radius :");
        Scanner s = new Scanner(System.in);
        float r = s.nextFloat();
        float ar;
        ar = (r * r) * 22 / 7;
		System.out.println("area of the circle is : " +  ar);
    }
}
class MethodWithoutParam_13{
    public static void main(String args[])  {
        Test obj = new Test();
        obj.areaCircle();
		
    }
}