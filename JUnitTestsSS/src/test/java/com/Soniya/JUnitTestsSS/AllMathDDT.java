package com.Soniya.JUnitTestsSS;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)

public class AllMathDDT
{
	private Calc c;
	
	@Before
	public void setUp() throws Exception
	{
		c = new Calc();
		c.switchOn();
	}

	@Test
	@FileParameters(value = "file:/Users/soniya/Documents/Eclipse_workspace/AllMathDDT.csv", 
			mapper = CsvWithHeaderMapper.class)
	public void testAllMath(int num1, char op, int num2, int expected)
	{
		c.add(num1);
		
		switch(op)
		{
		case '+':
			c.add(num2);
			break;
		case '-':
			c.subtract(num2);
			break;
		case '*':
			c.multiply(num2);
			break;
		case '/':
			if (num2 == 0)
			{
				System.out.println("division by zero");
				break;
			}
			c.divide(num2);
		}
		
		int aresult = c.getResult();
		assertThat("operand test", expected, equalTo(aresult));	
	}
}
