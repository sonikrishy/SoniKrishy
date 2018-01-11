package com.Soniya.JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest
{

	@Test(timeout = 5000)
	public void test()
	{
		while(true);
	}

}
