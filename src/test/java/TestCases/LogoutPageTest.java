package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LogInPage;
import Pages.LogoutPage;

public class LogoutPageTest extends TestBase{
	LogoutPage log;
	LogInPage log2;
	@BeforeMethod
	
	public void openBrowser() throws IOException, InterruptedException
	{
		intialazation();
		log = new LogoutPage();		
		log2 = new LogInPage();
		log2.userLog();
		
	}
	
	
	@Test
	public void verifypageLogo()
	{
		boolean value = log.pageLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test
	
	public void verfiyaccountLogout() throws InterruptedException
	{
		log.accountLogout();
	}
	
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}
