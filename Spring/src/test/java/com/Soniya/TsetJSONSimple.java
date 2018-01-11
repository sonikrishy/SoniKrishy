package com.Soniya;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class TsetJSONSimple
{
private String jsonPage;
private String service = "http://maps.googleapis.com"; //1st piece - generic service

//private String resource = "/maps/api/geocode/{format}";
private String resource = "/maps/api/geocode/json";

//private String params = "?address=877+Willow+Street,+San+Jose,+CA&sensor=false";
private String params = "?address={address}&sensor={sensor}";

private String url = service + resource + params;

//not elegant to have params hard coded

@Before
public void setUp() throws Exception
{
	HashMap<String, String> vars = new HashMap<String, String>(); //1 string for key, 1 for value
	vars.put("address", "877 Willow Street, San Jose,CA"); //don't need pluses, auto converted by restTemplate
	vars.put("sensor", "false");
	vars.put("format", "json");
	
	HttpHeaders headers = new HttpHeaders();
	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	
	HttpEntity<String> entity = new HttpEntity<String>(headers);
	
	RestTemplate restTemplate = new RestTemplate();
	jsonPage = restTemplate.postForObject(url, entity, String.class, vars);	
	
	//parse string received
}

@Test
public void test() throws ParseException
{
	//System.out.println(jsonPage);	
	//parse string received
	
	JSONParser parser = new JSONParser();
	JSONObject jsonObject = (JSONObject)parser.parse(jsonPage); //returns generic object
	//response is mapped to jsonobject
	
	String status = (String)jsonObject.get("status");
	assertEquals("OK", status);	
}
}
