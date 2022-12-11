//8. Java Program to Count Number of Objects Created for Class
public class CountNumberOfObjects_8
{
    static int count=0;
    CountNumberOfObjects_8()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        CountNumberOfObjects_8 obj1 = new CountNumberOfObjects_8();
        CountNumberOfObjects_8 obj2 = new CountNumberOfObjects_8();
        CountNumberOfObjects_8 obj3 = new CountNumberOfObjects_8();
        CountNumberOfObjects_8 obj4 = new CountNumberOfObjects_8();
        System.out.println("Number of objects created:"+count);
    }
}