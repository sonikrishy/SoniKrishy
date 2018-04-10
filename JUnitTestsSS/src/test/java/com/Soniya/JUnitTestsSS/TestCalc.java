package com.Soniya.JUnitTestsSS;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalc
{
	private Calc c;
	
	@Before
	public void setUp() throws Exception
	{
		c = new Calc();
		c.switchOn();
	}
	
	@Test
	public void testAdd1()
	{
		c.add(3);
		c.add(4);
		int aresult1 = c.getResult();
		assertEquals("sum of 3, 4 is ", 7, aresult1);
	}
	
	@Test
	public void testAdd2()
	{
		c.add(-10);
		c.add(-20);
		int aresult2 = c.getResult();
		assertTrue("sum of -10, -20 is ", -30 == aresult2);
	}
	
	@Test
	public void testSubtract1()
	{
		c.add(10);
		c.subtract(20);
		int aresult3 = c.getResult();
		assertEquals("subtraction of 20 from 10 is ", -10, aresult3);
	}

}
