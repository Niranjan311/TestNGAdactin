package org.adictin.rerun;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Transform.class)
public class A {
	
	@Test
	private void test1() {
		System.out.println("TestA1");
	
	}
	@Test
	private void test2() {
		Assert.assertTrue(false, "for rerun purpose");
		System.out.println("TestA2");
	
	}
	@Test
	private void test3() {
		System.out.println("TestA3");
	
	}
	

}
