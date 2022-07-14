package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase{
	
	@FindBy (xpath = "//button[text()='Start investing ']") private WebElement startBtn;
	@FindBy (xpath = "(//input[@icon='search'])[2]") private WebElement searchBar;
	@FindBy (xpath = "(//span[text()='ONGC'])[2]") private WebElement ongcShare;
	@FindBy (xpath = "//button[text()='Buy ']") private WebElement buyBtn;
	@FindBy (xpath = "//label[text()='Intraday ']") private WebElement intradayBtn;
	@FindBy (xpath = "//input[@label='Qty.']") private WebElement quntBtn;
	@FindBy (xpath = "//input[@label='Price']") private WebElement priceBtn;
	@FindBy (xpath = "//button[@type='submit']") private WebElement submitBtn;
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void buyShare() throws InterruptedException, EncryptedDocumentException, IOException
	{
		startBtn.click();
		Thread.sleep(2000);
//		searchBar.sendKeys("ONGC");
//		Thread.sleep(2000);
		searchBar.sendKeys(excelValues(0, 0));
		ongcShare.click();
		Thread.sleep(2000);
		buyBtn.click();
		Thread.sleep(2000);
		intradayBtn.click();
		Thread.sleep(2000);
		quntBtn.clear();
		Thread.sleep(2000);
//		quntBtn.sendKeys("1");
//		Thread.sleep(2000);
		quntBtn.sendKeys(excelValues(0, 1));
		priceBtn.clear();
		Thread.sleep(2000);
//		priceBtn.sendKeys("124.5");
//		Thread.sleep(2000);
		priceBtn.sendKeys(excelValues(0, 2));
		submitBtn.click();
		Thread.sleep(2000);

		
	}

}
