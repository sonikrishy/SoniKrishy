package com.Soniya;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class) //special runner
public class DDT
{

	@Test
	@FileParameters(value = "file:/Users/soniya/Documents/Eclipse_workspace/Address.csv", 
	mapper = CsvWithHeaderMapper.class)
	
	//2nd param coz first row in file is header, not data to take
	
	public void test(String name, String street, String city)
	{
	
		System.out.println("Name: " + name + ", Street: " + street + ", City: " + city);
	
	}

}
