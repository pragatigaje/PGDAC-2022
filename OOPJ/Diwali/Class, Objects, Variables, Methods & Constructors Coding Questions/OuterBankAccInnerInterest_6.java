//6. Java Program to Create Outer Class Bank Account and the Inner Class Interest in it

class BankAcct 
{
    int principal = 300, rate = 3, time = 5;
    void test() 
    {
        Interest innerObj = new Interest();
        innerObj.display();
    }
    class Interest 
    {
        void display() 
        {
            int si = (principal * rate * time) / 100;
            System.out.println("Interest : " + si + " Rs");
        }
    }
}
public class OuterBankAccInnerInterest_6 {
    public static void main(String args[]) 
    {
        BankAcct outerObj = new BankAcct();
        outerObj.test();
    }
}