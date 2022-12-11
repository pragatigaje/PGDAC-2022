class MyNonGen
{
    private Object data;

    void setData(Object data)
    {
        this.data = data;
    }
    Object getData()
    {
        return data;
    }

}

public class NonGenericsDemo 
{
    public static void main(String[] args) 
	{
        MyNonGen mg1 = new MyNonGen();
        mg1.setData(5);
        int a = (Integer)(mg1.getData());
        System.out.println(a);

        MyNonGen mg2 = new MyNonGen();
        mg2.setData("Welcome");
        String s = (String)(mg2.getData());
        System.out.println(s);
		
		mg1 = mg2;
    }
}
