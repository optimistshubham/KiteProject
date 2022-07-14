package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LogInPage;
import Utility.UtilFirst;
public class ScreenSotsLogInPage extends TestBase {

	LogInPage log;
	@BeforeMethod
	public void setUrl() throws IOException
	{
		intialazation();
		log = new LogInPage();
	}
	
	
	@Test
	public void verifykiteLogoTest()
	{
		boolean value = log.verifykiteLogo();
		Assert.assertEquals(value, true);
	}
	
	
	@Test 
	public void verifyzerodhaLogoTest()
	{
		boolean value = log.verifyzerodhaLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test (enabled = false)
	public void verifyappsLogoTest()
	{
		boolean value = log.verifyappsLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test 
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
	public void exit(ITestResult x) throws IOException
	{
		if(ITestResult.FAILURE==x.getStatus())
		{
			
			UtilFirst.getScreenShots(x.getName());
		}
		
		driver.quit();
	}
	
	
	
	



}
