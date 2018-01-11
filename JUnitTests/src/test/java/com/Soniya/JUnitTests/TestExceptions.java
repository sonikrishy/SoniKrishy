package com.Soniya.JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExceptions
{

	@Test(expected = ArithmeticException.class )
	public void test()
	{
		int i = 1/0; //throws arithmetic exception, this is what we expect, exception thrown, test passes	
	}

}
