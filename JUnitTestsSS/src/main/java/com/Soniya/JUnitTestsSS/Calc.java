package com.Soniya.JUnitTestsSS;

public class Calc
{
	private int result;
	
	public void switchOn()
	{
		result = 0;
	}
	
	public void add(int a)
	{
		 result += a;
	}
	
	public void subtract(int a)
	{
		 result -= a;
	}
	
	public void multiply(int a)
	{
		 result *= a;
	}
	
	public void divide(int a)
	{
		 result /= a;
	}
	
	public int getResult()
	{
		return result;
	}

}
