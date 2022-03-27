package repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInvoke {
	
	public WebDriver driver;
	public Properties data;
	
	public WebDriver invokebrowser() throws IOException {
		
		data = new Properties();
		FileInputStream file = new FileInputStream( System.getProperty("user.dir")+"\\src\\main\\java\\Repository\\Data.properties");
		data.load(file);
		
	String browservalue = data.getProperty("browser");
			
		if(browservalue.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src/main/java\\Repository\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if(browservalue.equals("headless")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src/main/java\\Repository\\chromedriver.exe");
			driver = new ChromeDriver(options);
			
		} else if (browservalue.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src/main/java\\Repository\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		} else if (browservalue.equals("IE")) {
			//Invoke IE browser
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
