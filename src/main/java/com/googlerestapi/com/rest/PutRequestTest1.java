package com.googlerestapi.com.rest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class PutRequestTest1 {
	@BeforeClass
	public void setBaseUri () {
	    RestAssured.baseURI = "https://localhost:3000";
	  }
	
	
	@Test
	public void updateUsingPut (){
		Posts post = new Posts();
		post.setId ("3");
	    post.setTitle ("Hello Bhutan");
	    post.setAuthor ("StaffWriter");
	    
	    given().body(post).when().contentType(ContentType.JSON)
	    .put("/posts/3");
	    
	    
	}
}
