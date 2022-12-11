//7. Java Program to Implement Shape Interface using Circle and Rectangle Class

interface Shape{ 
    void area();
}
class Circle implements Shape
{
    int r = 5;
    double pi = 3.14, area = 0; 
    public void area()
   {
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
    }
}
class Rectangle extends Circle
{
    int l = 5, b =6;
    double area; 
    public void area()
    {
        super.area();
        ar = l * b;
        System.out.println("Area of rectangle:"+ar);
    }
}
public class ShapeUsingCircle&Rectangle_7{
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(); 
        obj.area();
    }
}