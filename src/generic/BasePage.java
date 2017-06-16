package generic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is Matchin: "+eTitle,true);
		}
		catch(Exception e)
		{
			Reporter.log("eTitle is: "+eTitle+"\n aTitle is: "+driver.getTitle(),true);
			Reporter.log("Title is Not Matching",true);
			Assert.fail();
		}
	}
	public void verifyElementPresent(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present",true);
			Assert.fail();
		}
	}
}
