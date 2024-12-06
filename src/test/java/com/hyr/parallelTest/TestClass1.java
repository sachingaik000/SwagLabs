package com.hyr.parallelTest;

import org.testng.annotations.Test;

public class TestClass1 {

	@Test(invocationCount=1, threadPoolSize=2)
	public void testMethod1()
	{
		System.out.println("TestClass1  >> TestMethod1 >>"+Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod2()
	{
		System.out.println("TestClass2  >> TestMethod2 >>"+Thread.currentThread().getId());
	}
	@Test
	public void testMethod3()
	{
		System.out.println("TestClass3  >> TestMethod3 >>"+Thread.currentThread().getId());
	}
	@Test
	public void testMethod4()
	{
		System.out.println("TestClass4  >> TestMethod4 >>"+Thread.currentThread().getId());
	}
}
