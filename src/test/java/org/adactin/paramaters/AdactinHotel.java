package org.adactin.paramaters;

import org.adactin.pages.LoginPage;
import org.base.BaseClass;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

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
	private void test(@Optional("Niranjan31")String user,@Optional("Niranjan@31") String pass) {
		launchUrl("https://adactinhotelapp.com/index.php");
		implicitWait(20);
		LoginPage l = new LoginPage();
		fillTextBox(l.getTxtUsername(), user);
		fillTextBox(l.getTxtPassword(), pass);
		btnClick(l.getBtnLogin());

	}
	

}
