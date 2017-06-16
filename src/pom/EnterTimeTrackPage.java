package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generic.BasePage;

public class EnterTimeTrackPage extends BasePage
{
	@FindBy(id="logoutLink")
	private WebElement logoutLNK;
	
	@FindBy(xpath="//div[contains(@onclick,'popup_menu_support')]")
	private WebElement HelpMNU;
	
	@FindBy(linkText="About actiTIME")
	private WebElement aboutActiTimeOPT;

	@FindBy(xpath="//span[contains(.,'build')]")
	private WebElement buildNumber;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement closePopUp;
	
	@FindBy(xpath="//div[@class='popup_menu_icon settings_icon']")
	private WebElement settingMNU;
	
	@FindBy(linkText="Licenses")
	private WebElement licenseOPT;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout()
	{
		logoutLNK.click();
	}
	
	public void clickHelpMenu()
	{
		HelpMNU.click();
	}
	
	public void clickAboutactiTime()
	{
		aboutActiTimeOPT.click();
	}
	
	public void verifyBuildNumber(String eBuild)
	{
		String aBuild=buildNumber.getText();
		Reporter.log("eBuild "+eBuild,true);
		Reporter.log("aBuild "+aBuild,true);
		Assert.assertEquals(aBuild, eBuild);
	}
	
	public void closePOPUP()
	{
		closePopUp.click();
	}
	
	public void clickSettingMenu()
	{
		settingMNU.click();
	}
	
	public void clickLicenses()
	{
		licenseOPT.click();
	}
}
