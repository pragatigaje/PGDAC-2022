package DemoHtml;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class TestElement3
{
ChromeDriver driver;
String url="http://demo.guru99.com/v4/";

///Method to Start Browser with mentioned url using chrome driver
public void invokeBrowser()
{
	System.setProperty("webdriver.chrome.driver", "E:\\EclipseWorkspace\\lib\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(url);
}

//Method to login to website & REGISTER FORM
public void login()
{
WebElement unm=driver.findElement(By.name("uid"));
unm.sendKeys("mngr471223");
driver.findElement(By.name("password")).sendKeys("vUmEpEs");
driver.findElement(By.name("btnLogin")).click();
}
public void addcustomer()
{
	driver.findElement(By.linkText("New Customer")).click();
	driver.findElement(By.name("name")).sendKeys("CDAC");
	driver.findElement(By.xpath("//input[@value='f']")).click();
	///html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]
	driver.findElement(By.name("dob")).sendKeys("08/09/2021");
	driver.findElement(By.name("addr")).sendKeys("Complex name");
	driver.findElement(By.name("city")).sendKeys("Mumbai");
	driver.findElement(By.name("state")).sendKeys("maharashtra");
	driver.findElement(By.name("pinno")).sendKeys("4332233");
	driver.findElement(By.name("telephoneno")).sendKeys("9093424289");
	driver.findElement(By.name("emailid")).sendKeys("ancti@saa.com");
	driver.findElement(By.name("password")).sendKeys("pr@123");
	driver.findElement(By.name("sub")).click();
	}

public static void main(String a[])
{
	TestElement3 dh= new TestElement3();
	dh.invokeBrowser();
	dh.login();
	dh.addcustomer();
	}
}

