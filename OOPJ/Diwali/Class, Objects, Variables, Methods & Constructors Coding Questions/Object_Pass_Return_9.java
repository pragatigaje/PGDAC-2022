//9. Java Program to Implement the Passing and Returning Objects

import java.util.Scanner;
class Object_Pass_Return_9 
{
    int length, breadth, area;
    Object_Pass_Return_9 area1(Object_Pass_Return_9 object1)
    {
        object1 = new Object_Pass_Return_9();
        object1.length = this.length;
        object1.breadth = this.breadth;
        object1.area = object1.length * object1.breadth;
        return object1;
    }
    Object_Pass_Return_9 area2(Object_Pass_Return_9 object2)
    {
        object2 = new Object_Pass_Return_9();
        object2.length = this.length + 5;
        object2.breadth = this.breadth + 6;
        object2.area = object2.length * object2.breadth;
        return object2;
    }
    public static void main(String[] args) 
    {
         Object_Pass_Return_9 obj = new Object_Pass_Return_9();
         Scanner s = new Scanner(System.in);
         System.out.print("Enter length:");
         obj.length = s.nextInt();
         System.out.print("Enter breadth:");
         obj.breadth = s.nextInt(); 
         Object_Pass_Return_9 a = obj.area1(obj);
         Object_Pass_Return_9 b = obj.area2(obj);
         System.out.println("Area:"+a.area);
         System.out.println("Area:"+b.area);
    }
}