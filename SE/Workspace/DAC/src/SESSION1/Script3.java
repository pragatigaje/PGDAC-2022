package SESSION1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {
	
	ChromeDriver driver;

	//to open a browser
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\EclipseWorkspace\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");  //open
		driver.manage().window().maximize(); //maximise
		//navigate().to/forward/backward/refresh
driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("Pen");
		//driver.navigate().back();
	driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Script3 o=new Script3();
o.open();
	}

}
