//OPEN A URL
package DemoHtml;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
public class TestElement1 
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
	driver.close();
}
	
	public static void main(String a[])
	{
		TestElement1 dh=new TestElement1();
		dh.invokeBrowser();
	
	}
}
