package com.googlerestapi.com.rest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

import static com.jayway.restassured.RestAssured.*;


public class UpdateRequestUsingPatch {
	 @BeforeClass
	  public void setBaseUri () {
	 }
	 
	 
	 @Test
	  public void updateUsingPatch () {
		 Posts post = new Posts();
		 post.setId("3");
		 post.setTitle ("Hello Vietnam");
		 
		 
		 given().body(post).when().
		 contentType(ContentType.JSON).patch("/posts/3");
		 
	 }
	 
	 
}
