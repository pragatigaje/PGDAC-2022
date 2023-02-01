//lOGIN TO WEBSITE
package DemoHtml;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
public class TestElement2 
{
	ChromeDriver driver;
	String url="http://demo.guru99.com/v4/";
	public void invokeBrowser()
	{
	System.setProperty("webdriver.chrome.driver","E:\\EclipseWorkspace\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(url);

}
	public void login()
	{
		WebElement unm=driver.findElement(By.name("uid"));
		unm.sendKeys("mngr471223");
		driver.findElement(By.name("password")).sendKeys("vUmEpEs");
		driver.findElement(By.name("btnLogin"));
		}
	public static void main(String a[])
	{
		TestElement2 dh=new TestElement2();
		dh.invokeBrowser();
		dh.login();
		
	}
}