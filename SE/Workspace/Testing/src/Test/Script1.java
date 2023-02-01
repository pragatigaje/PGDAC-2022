package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Script1 {


			ChromeDriver driver;
			String url="https://test.qatechhub.com/";
			public void invokeBrowser()
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\DAC-SEP-22\\SE\\Workspace\\lib\\chromedriver_win32\\chromedriver.exe");
			
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.findElement(By.xpath("/html/body/div/div/div/main/article/div/div[2]/div[1]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"PromptAlert\"]")).click();
			}
			
			public void closeBrowser()
			{
				driver.close();
			}
			
			public static void main(String args[])
			{
				
				Script1 wc=new Script1();
				wc.invokeBrowser();
				//wc.closeBrowser();
			}

		
		// TODO Auto-generated method stub

	}


