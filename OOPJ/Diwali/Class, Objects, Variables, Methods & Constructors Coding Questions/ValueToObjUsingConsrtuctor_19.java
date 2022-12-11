//19. Java Program to Create an Object for Class and Assign Value in the Object using Constructor

public class ValueToObjUsingConsrtuctor_19
{
    int a,b,c;
    ValueToObjUsingConsrtuctor_19()
    {
         a = 5;
         b = 6;
    }
    void change()
    {
        a = 15;
        b = 10;
        c = a + b;
    }
    public static void main(String[] args) 
    {
        ValueToObjUsingConsrtuctor_19 obj1 = new ValueToObjUsingConsrtuctor_19();
        System.out.println("a:"+obj1.a);
        System.out.println("b:"+obj1.b);
        obj1.change();
        System.out.println("New a:"+obj1.a);
        System.out.println("New b:"+obj1.b);
        System.out.println("c:"+obj1.c);
    }
}