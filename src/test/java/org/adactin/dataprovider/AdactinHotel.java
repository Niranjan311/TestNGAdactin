package org.adactin.dataprovider;

import org.adactin.pages.LoginPage;
import org.base.BaseClass;
import org.testng.annotations.*;

public class AdactinHotel extends BaseClass {
	
	@BeforeClass
	private void beforeClass() {
		launchBrowser("Chrome");
		implicitWait(20);

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
	
	@Test(dataProvider="login",dataProviderClass=Datas.class)
	private void test() {
		launchUrl("https://adactinhotelapp.com/index.php");
		implicitWait(20);
//		LoginPage l = new LoginPage();
//		fillTextBox(l.getTxtUsername(), user);
//		fillTextBox(l.getTxtPassword(), pass);
//		btnClick(l.getBtnLogin());

	}
	

}
