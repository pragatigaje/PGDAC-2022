//11. Java Program to Illustrate Use of Methods in a Class

public class UseOfMethod_11 {
    void addition(int a,int b) {
        int c = a + b;
        System.out.println("Result:"+c);
    }
    void subtraction(int a,int b) {
        int c = a - b;
        System.out.println("Result:"+c);
    }
    void multiplication(int a,int b) {
        int c = a * b;
        System.out.println("Result:"+c);
    }
    void division(int a,int b) {
        double c =(double)a / b;
        System.out.println("Result:"+c);
    }
    public static void main(String args[]){
 	UseOfMethod_11 obj = new UseOfMethod_11();
        obj.addition(10, 4);
        obj.subtraction(10, 4);
        obj.multiplication(10, 4);
        obj.division(10, 4);
    }
}