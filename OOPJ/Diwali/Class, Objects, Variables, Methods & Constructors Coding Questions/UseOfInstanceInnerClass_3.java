//********** 3. Java Program to Illustrates Use of Instance Inner Class
class Outer { 
    class Inner { 
        public void show()
        { 
            System.out.println("Inside Inner classs");
        }
    }
} 
class UseOfInstanceInnerClass_3 { 
    public static void main(String[] args)
    { 
        Outer.Inner a = new Outer().new Inner(); 
        a.show();
    }
} 