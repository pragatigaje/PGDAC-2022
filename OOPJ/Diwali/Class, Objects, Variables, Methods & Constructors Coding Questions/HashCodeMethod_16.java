//15. Java Program to Illustrate the Use of HashCode() Method

 class HashCodeMethod_16 {  
    public static void main(String[] args)  
    {   
        Integer i = new Integer("155");   
        int hashValue = i.hashCode();  
        System.out.println("Hash code Value for object is: " + hashValue);  
    }  
}