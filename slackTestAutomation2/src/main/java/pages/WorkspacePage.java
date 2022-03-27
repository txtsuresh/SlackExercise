package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkspacePage {
	public WebDriver driver;
	
	By workSpaceTextField = By.xpath("//input[@data-qa='signin_domain_input']");
	By continueButton = By.xpath("//button[@data-qa='submit_team_domain_button']");
	
public WorkspacePage(WebDriver driver) {
		this.driver=driver;
	}

public WebElement getWorkSpaceTextField() {
	return driver.findElement(workSpaceTextField);
	
	}

public WebElement getContinueButton() {
	return driver.findElement(continueButton);
	}
}
