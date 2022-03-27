package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	
	By generalChannel = By.xpath("//span[@data-qa='channel_sidebar_name_general']");
	By clientTextField = By.xpath("//div[@class='ql-editor ql-blank']");
	By sendTextButton = By.xpath("//button[@data-qa='texty_send_button']");
	By moreActionIcon = By.xpath("//i[@class='c-icon c-icon--vertical-ellipsis']");
	By addSavedItems = By.xpath("//div[contains(text(),'Add to saved items')]");
	By savedItemsChannel = By.xpath("//span[@data-qa='channel_sidebar_name_page_psaved']");
	By searchBar = By.xpath("//button[@data-qa='top_nav_search']");
	By searchTextField = By.xpath("//div[@class='ql-editor ql-blank']");
	By searchIcon = By.xpath("//i[@data-qa='entity-icon']");
	
public HomePage(WebDriver driver) {
		this.driver=driver;
	}

public WebElement getGeneralChannel() {
	return driver.findElement(generalChannel);
	}

public WebElement getClientTextField() {
	return driver.findElement(clientTextField);
	}

public WebElement getSendTextButton() {
	return driver.findElement(sendTextButton);
	}

public WebElement getSentClientText(String clientName) {
	return driver.findElement(By.xpath("//div[contains(text(),'"+clientName+"')]"));
	}

public WebElement getMoreActionIcon() {
	return driver.findElement(moreActionIcon);
	}

public WebElement getAddSavedItems() {
	return driver.findElement(addSavedItems);
	}

public WebElement getSavedItemsChannel() {
	return driver.findElement(savedItemsChannel);
	}

public WebElement getSearchBar() {
	return driver.findElement(searchBar);
	}

public WebElement getSearchTextField() {
	return driver.findElement(searchTextField);
	}

public WebElement getSearchIcon() {
	return driver.findElement(searchIcon);
	}
}
