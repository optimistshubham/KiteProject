package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LogoutPage extends TestBase {
	
	@FindBy (xpath = "//img[@alt='Kite logo']") private WebElement logo;
	@FindBy (xpath = "//span[@class='user-id']") private WebElement userIdBox;
	@FindBy (xpath = "//a[@target='_self']") private WebElement logoutBtn;
	

	public LogoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean pageLogo()
	{
		return logo.isDisplayed();		
	}
	
	public void accountLogout() throws InterruptedException
	{
		Thread.sleep(5000);
		userIdBox.click();
		Thread.sleep(5000);
		logoutBtn.click();
		Thread.sleep(5000);

	}


}
