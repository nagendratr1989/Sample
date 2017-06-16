package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generic.BasePage;

public class LoginPage extends BasePage
{
	@FindBy(xpath="//nobr[contains(.,'Pro')]")
	private WebElement version;
	
	@FindBy(id="username")
	private WebElement usernameTB;
	
	@FindBy(name="pwd")
	private WebElement passwordTB;
	
	@FindBy(id="loginButton")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errMSG;
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void verifyVersion(String eVersion)
	{
		String aVersion=version.getText();
		Reporter.log("eVersion "+eVersion);
		Reporter.log("aVersion "+aVersion);
		Assert.assertEquals(aVersion, eVersion);
	}
	
	public void setUsername(String un)
	{
		usernameTB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		passwordTB.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		loginBTN.click();
	}
	
	public void verifyerrorMsgPresent()
	{
		verifyElementPresent(errMSG);
	}
}
