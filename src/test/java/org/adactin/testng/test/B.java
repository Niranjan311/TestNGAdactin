package org.adactin.testng.test;

import org.testng.annotations.Test;

public class B {
	@Test
	private void test1() {
		System.out.println("TestB1");

	}
	
	@Test(enabled=false)
	private void test2() {
		System.out.println("TestB2");

	}

}
