package com.Soniya;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class Final
{
	private String url = "https://jsonview.com/example.json";
	@Test
	public void test()
	{
		RestTemplate restTemplate = new RestTemplate();
		JSONViewResponse3 page = restTemplate.getForObject(url, JSONViewResponse3.class);
		boolean awesome = page.isAwesome();
		System.out.println(awesome);
		
		//anObject - change integer to string - reponse is mapped, 
				
	
	}

}
