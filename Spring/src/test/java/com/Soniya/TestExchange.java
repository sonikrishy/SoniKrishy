package com.Soniya;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TestExchange
{
	private RestTemplate restTemplate;
	private String url = "https://jsonview.com/example.json";
	
	@Before
	public void setUp() throws Exception
	{
		restTemplate = new RestTemplate();
	}

	//exchange - very powerful method
	@Test
	public void test()
	{
		// create request headers
		//special class HTTP Headers
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		//mime type for request or response's entity body
		
		//http entity contains http header and entity body
		HttpEntity<String> requestEntity = new HttpEntity<String>(requestHeaders); //add headers to HttpEntity
		
		//exchange is for any method
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
		//exchange returns not string but responseEntity
		
		//how extract content now from ResponseEntity object
		String body = response.getBody();
		System.out.println(body);
		System.out.println(response);

		//how extract response headers
		//response is in json format, get content type
		MediaType contentType = response.getHeaders().getContentType();
		System.out.println("Content Type: " + contentType);
		
	}
}
