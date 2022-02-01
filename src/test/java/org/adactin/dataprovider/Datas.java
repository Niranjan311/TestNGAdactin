package org.adactin.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datas{
	
	@DataProvider(name="login")
	public Object[][] login() {
		Object[][] obj= new Object[][] {
			
			{"Niranjan31","Niranjan@31"},
			{"Sugan","968864"}			
		};
		return obj;		
	
	}
	@DataProvider(name="BookHotel")
	public Object[][] bookHotel() {
		Object[][] obj= new Object[][] {
			{"Niranjan","Kumar"},
			{"sugan","sugan"}
		};
		return obj;
		

	}
	
	@Test(dataProvider="login")
	public void test(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
		
		

	}

}
