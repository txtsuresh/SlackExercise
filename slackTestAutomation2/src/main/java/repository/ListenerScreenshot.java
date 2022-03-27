package repository;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ListenerScreenshot {
	public WebDriver driver;

	public String Sucessscreenshot( WebDriver driver) throws IOException {
		
		TakesScreenshot file= (TakesScreenshot)driver;
		File Source = file.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\screenshots\\slackTest.png";
		FileUtils.copyFile(Source, new File(destination));
		return destination;	
	}

}
