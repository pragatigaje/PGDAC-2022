


	package Test;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Script13 {
		String url="https://www.google.co.in/";
		WebDriver driver=new ChromeDriver();
		
		public void OpenBrowser()
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\DAC-SEP-22\\SE\\Workspace\\lib\\chromedriver_win32\\chromedriver.exe");
			driver.get(url);
			driver.manage().window().maximize();
			//driver.close();
			
		}

		public void PlayElements()
		{
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("CDAC");	
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Script13 o =new Script13();
	o.OpenBrowser();
	o.PlayElements();
		}

	}



