package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignInPage;
import pages.WorkspacePage;
import repository.BrowserInvoke;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SlackTest extends BrowserInvoke{
	
	public static Logger log = LogManager.getLogger(BrowserInvoke.class.getName());
	public WebDriver driver;
	private static String workSpaceName = "slackhometest";
	private static String clientText = "Slack Testing";
	private static String userName = "sureshtxt@gmail.com";
	private static String password = "slack123";
	private static String searchText = "has:star";

@Test
public void slackAutomationChallenge() throws IOException, InterruptedException {
	driver = invokebrowser();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get(data.getProperty("URL"));
	log.info("slack URL is launched");
	
	
//WorkSpace Page
	WorkspacePage workSpace = new WorkspacePage(driver);
	workSpace.getWorkSpaceTextField().sendKeys(workSpaceName);
	workSpace.getContinueButton().click();
	
	log.info("Workspace details are added successfully");

//SignIn Page
	SignInPage signIn = new SignInPage(driver);
	signIn.getemailAddressTextField().sendKeys(userName);
	signIn.getPasswordTextField().sendKeys(password);
	signIn.getSignInButton().click();
	
	log.info("Slack SignIn is successful");

//SlackHomePage
	HomePage home= new HomePage(driver);	
	
	home.getGeneralChannel().click();
	home.getClientTextField().sendKeys(clientText);	
	home.getSendTextButton().click();;
	home.getSentClientText(clientText).click();
	home.getMoreActionIcon().click();
	home.getAddSavedItems().click();
	home.getSavedItemsChannel().click();
	
	Assert.assertTrue(home.getSentClientText(clientText).isDisplayed());
	
	home.getSearchBar().click();
	home.getSearchTextField().sendKeys(searchText);
	home.getSearchIcon().click();
	
	Assert.assertTrue(home.getSentClientText(clientText).isDisplayed());
	
	log.info("slack test is sucessfully executed");

	
}

@AfterTest
public void closeBrowser() {
	driver.close();
	}
}
