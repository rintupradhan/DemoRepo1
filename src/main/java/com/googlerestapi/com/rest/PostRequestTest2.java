package com.googlerestapi.com.rest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

import static com.jayway.restassured.RestAssured.*;

public class PostRequestTest2 {
	@BeforeClass
	public void setBaseUri(){
		RestAssured.baseURI="http://localhost:3000";
	}
	
	@Test
	public void sendPostObject(){
		Posts post = new Posts();
		post.setId("3");
		post.setAuthor("StaffWriter");
		post.setTitle("Hello India");
		
		given().body(post).when().contentType(ContentType.JSON)
		.post("/posts");
		
	}
	
}
