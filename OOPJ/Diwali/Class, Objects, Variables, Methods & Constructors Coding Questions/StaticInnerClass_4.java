//4. Java Program to Illustrates Use of Static Inner Class

import java.util.*;
class Outer {
    private static void outerMethod(){
        System.out.println("inside outerMethod");
    }
    static class Inner {
 
        public static void display()
        {
            System.out.println("inside static inner class Method");
            outerMethod();
        }
    }
}
  
class StaticInnerClass_4 { 
    public static void main(String args[])
    {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}