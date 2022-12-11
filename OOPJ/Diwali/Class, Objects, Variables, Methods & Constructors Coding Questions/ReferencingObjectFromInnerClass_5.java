//5. Java Program to Illustrates Use of Referencing the Object from Inner Class

class OuterClass
{
    static OuterClass.InnerClass obj;
    void test1()
    {
        System.out.println("Success");
    }
    static public class InnerClass
    { 
        public void test2()
        {
            OuterClass outer = new OuterClass();
            outer.test1();
        }
    }
}
class ReferencingObjectFromInnerClass_5{
    public static void main(String[] args)
    {
        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.test2();
    }
}