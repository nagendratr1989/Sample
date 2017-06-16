package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;

public class InvalidLogin extends BaseTest
{
	@Test(priority=3)
	public void testInvalidLogin()
	{
		String un=Excel.getCellData(INPUT_PATH, "InvalidLogin", 1, 0);
		String pw=Excel.getCellData(INPUT_PATH, "InvalidLogin", 1, 1);
		LoginPage l=new LoginPage(driver);
		//Enter invalid user name
		l.setUsername(un);
		//Enter invalid password
		l.setPassword(pw);
		//Click on login button
		l.clickLogin();
		//Verify error message is displayed
		l.verifyerrorMsgPresent();
	}
}
