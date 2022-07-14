package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
	public void openZerodha()
	{
		ChromeOptions x = new ChromeOptions();
		x.addArguments("--disable-notifications");
				
		System.setProperty("WebDriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver(x);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.close();
		
		
	}
	@Test
	public void openUpstox()
	{
		
		ChromeOptions x = new ChromeOptions();
		x.addArguments("--disable-notifications");
		
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver(x);
		driver.manage().window().maximize();
		driver.get("https://upstox.com/");
		driver.close();		
	}
	@Test
	public void openGroww()
	{
		ChromeOptions x = new ChromeOptions();
		x.addArguments("--disable-notifications");
	
		System.setProperty("Webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver(x);
		driver.manage().window().maximize();
		driver.get("https://groww.in/");
		driver.close();
				
	}
	
	
	

}
