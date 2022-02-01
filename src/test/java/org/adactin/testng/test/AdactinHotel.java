package org.adactin.testng.test;

import org.base.BaseClass;
import org.adactin.pages.LoginPage;
import org.testng.annotations.*;

public class AdactinHotel extends BaseClass {
	
	@BeforeClass
	private void beforeClass() {
		launchBrowser("Chrome");

	}	
	@AfterClass
	private void afterClass() {

	}	
	@BeforeMethod
	private void beforeMethod() {

	}	
	@AfterMethod
	private void afterMethod() {

	}	
	@Parameters({"username", "password"})
	@Test
	private void test(@Optional("sugan") String user,@Optional("143") String pass) {
		launchUrl("https://adactinhotelapp.com/index.php");
		implicitWait(20);
		LoginPage l = new LoginPage();
		fillTextBox(l.getTxtUsername(), user);
		fillTextBox(l.getTxtPassword(), pass);
		btnClick(l.getBtnLogin());
		
	}
	

}
