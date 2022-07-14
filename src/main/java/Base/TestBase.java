package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	
	public String readProperties(String value) throws IOException
	{
		Properties setProperties = new Properties();
		FileInputStream file = new FileInputStream("C:\\Eclipse\\Eclipse workspace\\ZerodhaProject\\src\\main\\java\\Config\\Config.properties");
		setProperties.load(file);
		return setProperties.getProperty(value);
	
	}
//

	
	public String excelValues(int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
//		FileInputStream file = new FileInputStream("C:\\Eclipse\\Eclipse workspace\\ZerodhaProject\\TestData\\ONGCTestData.xlsx");
		FileInputStream file = new FileInputStream("C:\\Eclipse\\Eclipse workspace\\ZerodhaProject\\TestData\\TcsData.xlsx");
	
		Sheet inputExcel = WorkbookFactory.create(file).getSheet("Sheet1");
	    String readExcel = inputExcel.getRow(rowNum).getCell(cellNum).getStringCellValue();
	    return readExcel;
	}


	
	
	
//	@SuppressWarnings("deprecation")
	public void intialazation() throws IOException
	{
		
		String browser = readProperties("Browser");
		
		if(browser.equalsIgnoreCase("Chrome"))
		{	
		ChromeOptions x = new ChromeOptions();
        x.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
//		System.setProperty("WebDriver.chrome.driver", "ChromeDriver");
		driver = new ChromeDriver(x);
		}
		
		else if (browser.equalsIgnoreCase("Edge"))
		{
			    WebDriverManager.edgedriver().setup();
//				System.setProperty("Webdriver.edge.driver", "msedgedriver");
				driver = new EdgeDriver();
		}
		
		else if (browser.equalsIgnoreCase("Opera")) 
		{
			WebDriverManager.operadriver().setup();
//			System.setProperty("Webdriver.opera.driver", "Operadirver");
			driver = new OperaDriver();
			
		}
		
		else if (browser.equalsIgnoreCase("Firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
//			System.setProperty("Webdriver.gecko.driver", "geckodriver");
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.get(readProperties("Url"));
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
