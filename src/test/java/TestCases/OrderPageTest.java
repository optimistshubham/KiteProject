package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LogInPage;
import Pages.OrderPage;

public class OrderPageTest extends TestBase {
	OrderPage log;
	LogInPage log2;
	@BeforeMethod
	public void setUrl() throws IOException, InterruptedException
	{
		intialazation();
		log = new OrderPage();
	    log2 = new LogInPage();
	    log2.userLog();
	}
	
	@Test
	public void verifyOrderPage() throws EncryptedDocumentException, IOException, InterruptedException
	{
		log.createGtt();
	}

	
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
