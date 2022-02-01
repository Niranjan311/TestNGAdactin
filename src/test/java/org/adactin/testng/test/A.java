package org.adactin.testng.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	

	
	@Test(groups="smoke")
	private void test1() {
		System.out.println("TestA1");

	}	
	@Test(priority=-1, invocationCount=3, groups="sanity")
	private void test2() {
		System.out.println("TestA2");
		
	}
	@Test(enabled= false)
	private void test3() {
		System.out.println("TestA3");
		
	}
	@Test(groups="regression")
	private void test4() {
		System.out.println("TestA4");
		
	}
	@Test(dataProvider= "login", groups="smoke")
	private void test5(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
		
	}
	
	@DataProvider(name="login", indices= {0})
	private Object[][] data() {
		
		Object[][] obj = new Object[][] {
			
			{"niranjan", "kumar"},
			{"prem", "jos"}
			
		};
		return obj;

	}

}
