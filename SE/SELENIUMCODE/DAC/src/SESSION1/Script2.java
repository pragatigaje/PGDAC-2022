package SESSION1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
	
	ChromeDriver driver;

	//to open a browser
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\EclipseWorkspace\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");  //open
		driver.manage().window().maximize(); //maximise
		//driver.close();//close
	}
	
	public void login()
	{
		WebElement usnm=driver.findElement(By.name("uid"));
		usnm.sendKeys("mngr474695");
		
		driver.findElement(By.name("password")).sendKeys("jApYtEp");  //function chaining
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("New Customer")).click();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Script2 o=new Script2();
o.open();
o.login();
	}

}
