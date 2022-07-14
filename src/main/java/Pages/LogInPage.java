package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LogInPage extends TestBase{
	
	
	@FindBy (xpath = "//img[@alt='Kite']") private WebElement kiteLogo;
	@FindBy (xpath = "//div[@class='app-icons']") private WebElement appsLogo;
	@FindBy (xpath = "//img[@alt='Zerodha']") private WebElement zerodhaLogo;
	
	
	@FindBy (xpath = "//input[@id='userid']") private WebElement userId;
	@FindBy (xpath = "//input[@id='password']") private WebElement userPass;
	@FindBy (xpath = "//button[@type='submit']") private WebElement submitBtn;
	@FindBy (xpath = "//input[@id='pin']") private WebElement userPin;
	@FindBy (xpath = "//button[@type='submit']") private WebElement clickBtn;
	
	
	
	
	public LogInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean  verifykiteLogo()
	{
		return kiteLogo.isDisplayed();
	}
	
	public boolean verifyappsLogo()
	{
		return appsLogo.isDisplayed();
	}
	
	public boolean verifyzerodhaLogo()
	{
		return zerodhaLogo.isDisplayed();
	}
	
	public String verifyTitle() 
	{
		return driver.getTitle();
	}
	

	public void userLog() throws IOException, InterruptedException
	{
		userId.sendKeys(readProperties("UserName"));
		userPass.sendKeys(readProperties("PassWord"));
		submitBtn.click();
		Thread.sleep(5000);
		userPin.sendKeys(readProperties("Pin"));
		clickBtn.click();
		Thread.sleep(5000);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
