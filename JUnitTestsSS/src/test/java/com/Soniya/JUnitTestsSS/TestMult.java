package com.Soniya.JUnitTestsSS;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMult
{
	private Calc c;
	
	@Before
	public void setUp() throws Exception
	{
		c = new Calc();
		c.switchOn();
	}

	@Test
	public void test()
	{ 
		c.add(7);
		c.multiply(9);
		int aresult = c.getResult();
		assertEquals("product of 7 nd 9: ", 63, aresult);
	}

	@Test
	public void test1()
	{ 
		c.add(0);
		c.multiply(99);
		int aresult1 = c.getResult();
		assertEquals("product of 0 nd 99: ", 10, aresult1);
	}
}
