package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script12 {

	public void OpenBrowser()
	{
		String url="https://www.google.co.in/";
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\DAC-SEP-22\\SE\\Workspace\\lib\\chromedriver_win32\\chromedriver.exe");
		driver.get(url);
		driver.manage().window().maximize();
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Script12 o =new Script12();
o.OpenBrowser();
	}

}
