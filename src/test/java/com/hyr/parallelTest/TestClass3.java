package com.hyr.parallelTest;

import org.testng.annotations.Test;

public class TestClass3 {

	@Test
	public void testMethod8()
	{
		System.out.println("TestClass8  >> TestMethod8 >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod9()
	{
		System.out.println("TestClass9  >> TestMethod9 >>"+Thread.currentThread().getId());
	}@Test
	public void testMethod10()
	{
		System.out.println("TestClass10  >> TestMethod10 >>"+Thread.currentThread().getId());
	}
}
