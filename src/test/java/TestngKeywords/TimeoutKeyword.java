package TestngKeywords;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LogInPage;

public class TimeoutKeyword extends TestBase {
	LogInPage log;
	@BeforeMethod
	public void setUrl() throws IOException
	{
		intialazation();
		log = new LogInPage();
	}
	
	
	@Test (timeOut = 1000)
	public void verifykiteLogoTest()
	{
		boolean value = log.verifykiteLogo();
		Assert.assertEquals(value, true);
	}
	
	
	@Test (timeOut = 1000)
	public void verifyzerodhaLogoTest()
	{
		boolean value = log.verifyzerodhaLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test (timeOut = 1000)
	public void verifyappsLogoTest()
	{
		boolean value = log.verifyappsLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test (timeOut = 1000)
	public void verifyTitle()
	{
		String value = log.verifyTitle();
		Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", value);
	}
	
	@Test (timeOut = 1000)
	public void verifyuserLog() throws IOException, InterruptedException
	{
		log.userLog();
	}
	
	
	
	
	@AfterMethod
	public void exit()
	{
		driver.quit();
	}
	
	
	

}
