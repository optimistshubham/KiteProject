package TestngKeywords;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LogInPage;

public class GroupKeyword extends TestBase {

	LogInPage log;
	@BeforeMethod (groups = {"Sanity","Regression"})
	public void setUrl() throws IOException
	{
		intialazation();
		log = new LogInPage();
	}
	
	
	@Test (groups = "Regression")
	public void verifykiteLogoTest()
	{
		boolean value = log.verifykiteLogo();
		Assert.assertEquals(value, true);
	}
	
	
	@Test (groups = "Regression")
	public void verifyzerodhaLogoTest()
	{
		boolean value = log.verifyzerodhaLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test (groups = "Regression")
	public void verifyappsLogoTest()
	{
		boolean value = log.verifyappsLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test (groups = "Regression")
	public void verifyTitle()
	{
		String value = log.verifyTitle();
		Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", value);
	}
	
	@Test (groups = "Sanity")
	public void verifyuserLog() throws IOException, InterruptedException
	{
		log.userLog();
	}
	
	
	
	
	@AfterMethod (groups = {"Sanity","Regression"})
	public void exit()
	{
		driver.quit();
	}
	
	
	
	



}
