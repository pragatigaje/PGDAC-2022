package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script14 {
	
	WebDriver driver=new ChromeDriver();
	
	void Open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\DAC-SEP-22\\SE\\Workspace\\lib\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	void HtmlElement()
	{
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("abc");
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Script14 o= new Script14();
			o.Open();
			o.HtmlElement();
	
	}
}
