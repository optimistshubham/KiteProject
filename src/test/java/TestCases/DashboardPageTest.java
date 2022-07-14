package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LogInPage;

public class DashboardPageTest extends TestBase {
	DashboardPage log;
	LogInPage set;
	@BeforeMethod
	public void openUrl() throws IOException, InterruptedException
	{
		intialazation();
		log = new DashboardPage();
		set = new LogInPage();
		set.userLog();
	}
	

	@Test
	public void buyShareTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		log.buyShare();
	}
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
	

}
