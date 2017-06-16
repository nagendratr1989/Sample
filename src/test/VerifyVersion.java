package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;

public class VerifyVersion extends BaseTest
{
	@Test(priority=1)
	public void testVersion()
	{
		String eVersion=Excel.getCellData(INPUT_PATH, "VerifyVersion", 1, 0);
		//Verify that version is actiTIME 2014 Pro
		LoginPage l=new LoginPage(driver);
		l.verifyVersion(eVersion);
	}
}
