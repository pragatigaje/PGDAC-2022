package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script11 {
	
	public void OpenBrowser()
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\DAC-SEP-22\\SE\\Workspace\\lib\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.tripadvisor.in/");
		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/form/input[1]")).sendKeys("Paris");
		driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div/div/form/input[1]")).sendKeys(Keys.RETURN);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Script11 o =new Script11();
o.OpenBrowser();
	}

}
