package com.Soniya.JUnitTests;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*; //type it

import org.junit.Test;

public class Hamcrest
{

	@Test
	public void test()
	{
		int sum = 2;
		
		assertThat("sum test", sum, equalTo(2));
		
		assertThat(sum, is(2));
		
		assertThat(sum, is(not(3)));
		
		assertThat(sum, greaterThan(0));
		
		assertThat(sum, is(greaterThan(1)));
		
		
		String str = "White Box Testing";
		
		assertThat(str, containsString("White"));
		
		assertThat(str, equalToIgnoringCase("white box testing"));
		
		assertThat(str, not(equalToIgnoringCase("black box testing")));
	}
}
