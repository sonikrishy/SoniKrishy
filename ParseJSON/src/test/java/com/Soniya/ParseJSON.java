package com.Soniya;


import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class ParseJSON
{
	private HttpClient client;
	
	@Before
	public void setUp() throws Exception
	{
		client = HttpClientBuilder.create().build();
	}

	@Test
	public void test() throws IOException
	{
		//get response
		HttpResponse response = client.execute(new HttpGet("http://jsonplaceholder.typicode.com/posts/1/comments"));
		//sends request to remote server, may have exception, can use high level IOException 
		
		//status code
		int status_code = response.getStatusLine().getStatusCode();
		System.out.println("Status code: " + status_code);
		
		String reason_phrase = response.getStatusLine().getReasonPhrase();
		System.out.println("Reason phrase: " + reason_phrase);
		
		String body = EntityUtils.toString(response.getEntity()); //entity body is converted to string
		System.out.println(body);
		
		//special class json array to parse response which is as array
		
		JSONArray jsonArray = new JSONArray(body); //constructor
		// each curly brace pair is an object; array of objects/classes
		
		JSONObject element0 = jsonArray.getJSONObject(0);
		
		//key value pairs
		
		int postId = element0.getInt("postId");
		assertEquals(1, postId);
		
		JSONObject element3 = jsonArray.getJSONObject(3);
				
		String email = element3.getString("email");
		assertEquals("Lew@alysha.tv", email);
		
	}

}
