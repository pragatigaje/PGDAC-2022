package SESSION1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
	ChromeDriver driver;

	//to open a browser
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\DAC-SEP-22\\SE\\Workspace\\lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//url to be opened
		driver.get("https://demo.guru99.com/v4/");
		//maximize window screen of chrome
		driver.manage().window().maximize();
		//driver.close();
	}
	
	public void login()
	{
		//sending uname using name
		WebElement uname = driver.findElement(By.name("uid"));
		uname.sendKeys("mngr474756");
		//function chaining
		driver.findElement(By.name("password")).sendKeys("utatUmu");
		//logging by clicking button
		driver.findElement(By.name("btnLogin")).click();
	}

	public static void main(String[] args) {

		Script2 s2 = new Script2();
		s2.open();
		s2.login();
	}
}


//generated uname and pw : mngr474756 utatUmu