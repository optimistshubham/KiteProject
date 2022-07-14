package TestngKeywords;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LogInPage;

public class PriorityKeyword extends TestBase {
	LogInPage log;
	@BeforeMethod
	public void setUrl() throws IOException
	{
		intialazation();
		log = new LogInPage();
	}
	
	
	@Test (priority = 2)
	public void verifykiteLogoTest()
	{
		boolean value = log.verifykiteLogo();
		Assert.assertEquals(value, true);
	}
	
	
	@Test (priority = 1) 
	public void verifyzerodhaLogoTest()
	{
		boolean value = log.verifyzerodhaLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test (priority = 3)
	public void verifyappsLogoTest()
	{
		boolean value = log.verifyappsLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test (priority = 0)
	public void verifyTitle()
	{
		String value = log.verifyTitle();
		Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", value);
	}
	
	@Test
	public void verifyuserLog() throws IOException, InterruptedException
	{
		log.userLog();
		Assert.assertFalse(true);
	}
	
	
	@AfterMethod
	public void exit()
	{
		driver.quit();
	}
	
}
