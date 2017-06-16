package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends BaseTest
{
	@Test(priority=2)
	public void testValidLoginLogout()
	{
		String un=Excel.getCellData(INPUT_PATH, "ValidLoginLogout", 1, 0);
		String pw=Excel.getCellData(INPUT_PATH, "ValidLoginLogout", 1, 1);
		String hpTitle=Excel.getCellData(INPUT_PATH, "ValidLoginLogout", 1, 2);
		String lpTitle=Excel.getCellData(INPUT_PATH, "ValidLoginLogout", 1, 3);
		//Enter valid user name
		LoginPage l=new LoginPage(driver);
		l.setUsername(un);
		//Enter valid password
		l.setPassword(pw);
		//Click on login button
		l.clickLogin();
		//Verify home page title
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.verifyTitle(hpTitle);
		//click logout
		e.clickLogout();
		//Verify Login Page
		l.verifyTitle(lpTitle);
	}
}
