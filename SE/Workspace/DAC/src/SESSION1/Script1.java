package SESSION1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
	ChromeDriver driver;
	
	//to open a browser
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\DAC-SEP-22\\SE\\Workspace\\lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//url to be opened
		driver.get("https://www.google.com/");
		//maximize window screen of chrome
		driver.manage().window().maximize();
		//driver.close();
	}
	
	public static void main(String[] args) {
		
		Script1 s1 = new Script1();
		s1.open();
	}
}
