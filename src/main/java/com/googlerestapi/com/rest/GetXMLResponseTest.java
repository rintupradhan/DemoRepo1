package com.googlerestapi.com.rest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetXMLResponseTest {
	@BeforeClass
	public void setBaseUri () {
	    RestAssured.baseURI = "https://maps.googleapis.com";
	  }
	
	@Test
	 public void test01()  {
		Response res = given().param("query", "Churchgate Station")
				.when().get("/maps/api/place/textsearch/xml").then().contentType(ContentType.XML)
				.extract().response();
		
		 	System.out.println (res.asString ());
	}
}
