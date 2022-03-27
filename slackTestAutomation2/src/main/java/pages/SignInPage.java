package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	public WebDriver driver;
	
	By emailAddressTextField = By.xpath("//input[@data-qa='login_email']");
	By passwordTextField = By.xpath("//input[@data-qa='login_password']");
	By signInButton = By.xpath("//button[@data-qa='signin_button']");
	
public SignInPage(WebDriver driver) {
		this.driver=driver;
	}

public WebElement getemailAddressTextField() {	
	return driver.findElement(emailAddressTextField);
	}

public WebElement getPasswordTextField() {	
	return driver.findElement(passwordTextField);
	}

public WebElement getSignInButton() {	
	return driver.findElement(signInButton);
	}
}
