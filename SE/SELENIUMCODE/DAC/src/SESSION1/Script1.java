package SESSION1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
	
	ChromeDriver driver;

	//to open a browser
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\EclipseWorkspace\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");  //open
		driver.manage().window().maximize(); //maximise
		String s= driver.getTitle();
		String s1=driver.getCurrentUrl();
		String s2=driver.getPageSource();
		System.out.println("Title of the page "+s);
		System.out.println("Current url is  "+s1);
		System.out.println("Page source "+s.length());
		
		//driver.close();//close only particular window
		driver.quit();//close all tabs close browser
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Script1 o=new Script1();
o.open();
	}

}
