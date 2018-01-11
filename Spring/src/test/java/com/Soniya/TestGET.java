package com.Soniya;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class TestGET
{
	@Test
	public void test()
	{
		RestTemplate restTemplate = new RestTemplate();
		String page = restTemplate.getForObject("https://jsonview.com/example.json", String.class);
		System.out.println(page);
	}

}
