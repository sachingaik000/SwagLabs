package com.hyr.parallelTest;

import org.testng.annotations.Test;

public class TestClass2 {

	@Test
	public void testMethod5()
	{
		System.out.println("TestClass5  >> TestMethod5 >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod6()
	{
		System.out.println("TestClass6  >> TestMethod6 >>"+Thread.currentThread().getId());
	}@Test
	public void testMethod7()
	{
		System.out.println("TestClass7  >> TestMethod7 >>"+Thread.currentThread().getId());
	}
}
