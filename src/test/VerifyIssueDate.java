package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class VerifyIssueDate extends BaseTest
{

	@Test(priority=5)
	public void testVerifyBuildNumber()
	{
		String un=Excel.getCellData(INPUT_PATH, "ValidLoginLogout", 1, 0);
		String pw=Excel.getCellData(INPUT_PATH, "ValidLoginLogout", 1, 1);
		//String buildNo=Excel.getCellData(INPUT_PATH, "VerifyBuildNumber", 1, 0);
		//Enter valid user name
		LoginPage l=new LoginPage(driver);
		l.setUsername(un);
		//Enter valid password
		l.setPassword(pw);
		//Click on login button
		l.clickLogin();
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		//Click on settings icon
		e.clickSettingMenu();
		//Click on licenses
		e.clickLicenses();
	}

}
