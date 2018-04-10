package com.Soniya.JUnitTestsSS;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class SubDDT
{
	private Calc c;
	
	@Before
	public void setUp() throws Exception
	{
		c = new Calc();
		c.switchOn();
	}

	@Test
	@FileParameters(value = "file:/Users/soniya/Documents/Eclipse_workspace/Subtraction.csv", 
			mapper = CsvWithHeaderMapper.class)
	
	public void testSub(int num1, int num2, int expected)
	{
		c.add(num1);
		c.subtract(num2);
		int aresult = c.getResult();
		assertThat("Subtraction test", expected, equalTo(aresult));
	}

}
