package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class UtilFirst extends TestBase{
	
	
	public static void getScreenShots(String name) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Eclipse\\Eclipse workspace\\ZerodhaProject\\ScreenShots/"+name+".png");
		FileHandler.copy(source, dest);
	}

	

}
