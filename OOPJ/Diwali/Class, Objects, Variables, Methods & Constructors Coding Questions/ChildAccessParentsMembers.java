//21. Java Program to Allocate and Initialize Super Class Members using Constructor

 class Parent {
     Parent(int a, int b) {
         System.out.println(" the super class constructor");
          int z = a + b;
         System.out.println("the super class method ");
         System.out.println("the sum is "+z);
     }
 }
public class ChildAccessParentsMembers extends Parent {
    ChildAccessParentsMembers(int x) {
        super(23, 30);                                  //will call parent class method
        System.out.println("the sub class constructor ");
        System.out.println(x);
    }
    public static void main(String ... a) {          //..vararg
        ChildAccessParentsMembers obj = new ChildAccessParentsMembers-(20);
     }
}