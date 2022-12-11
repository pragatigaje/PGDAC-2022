interface DBDriver
{
	iny MAX_CONNECTION = 500;
	void creatConnection();
	void getConnection();
	void closeConnection();
}
class OracleDBDriver implements DBDriver
{
	void creatConnection()
	{
		System.out.println("creatConnection of OracleDBDriver");
		System.out.println("Max connection allowed : "+DBDriver.MAX_CONNECTION);
	}
	void getConnection();
	{
		System.out.println("getConnection of OracleDBDriver");
	}
	void closeConnection();
	{
		System.out.println("closeConnection of OracleDBDriver");
	}
}

class InterfaceDemo
{
	public static void main(String args[])
	{
		OracleDBDriver ora = new OracleDBDriver();
		ora.createConnection();
		ora.closeConnection();
		
		DBDriver driver = new OracleDBDriver();
		driver.createConnection();
		driver.closeConnection();
	}
}