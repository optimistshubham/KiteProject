package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OrderPage extends TestBase{
	
	@FindBy (xpath = "//span[text()='Orders']") private WebElement orderBtn;
	@FindBy (xpath = "//button[@type='button']") private WebElement getStartedBtn;
	@FindBy (xpath = "(//input[@icon='search'])[2]") private WebElement searchBar;
	@FindBy (xpath = "(//span[text()='TCS'])[2]") private WebElement enterTcs;
	@FindBy (xpath = "//button[text()='Create GTT ']") private WebElement gttBtn;
	@FindBy (xpath = "//input[@label='Trigger price']") private WebElement triggerBtn;
	@FindBy (xpath = "//input[@label='Qty.']") private WebElement qtyBtn;
	@FindBy (xpath = "//input[@label='Price']") private WebElement priceBtn;
	@FindBy (xpath = "//div[text()='Place']") private WebElement placeBtn;
	
	
	public OrderPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void createGtt() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(2000);
		orderBtn.click();
		Thread.sleep(2000);
		getStartedBtn.click();
		Thread.sleep(2000);
		searchBar.sendKeys(excelValues(0, 0));;
		Thread.sleep(2000);
		enterTcs.click();;
		Thread.sleep(2000);
		gttBtn.click();
		Thread.sleep(2000);
		triggerBtn.clear();
		Thread.sleep(2000);
		triggerBtn.sendKeys(excelValues(0, 1));
		Thread.sleep(2000);
		qtyBtn.clear();
		Thread.sleep(2000);
		qtyBtn.sendKeys(excelValues(0, 2));
		Thread.sleep(2000);
		priceBtn.clear();
		Thread.sleep(2000);
		priceBtn.sendKeys(excelValues(0, 2));
		Thread.sleep(2000);
		placeBtn.click();
		
		
	}
	
	

}
