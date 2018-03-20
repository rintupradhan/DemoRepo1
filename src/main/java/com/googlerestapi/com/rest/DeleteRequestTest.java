package com.googlerestapi.com.rest;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class DeleteRequestTest {

  @BeforeClass
  public void setBaseUri () {

    RestAssured.baseURI = "https://localhost:3000";
  }


@Test
  public void deleteTest () {
      
    given()
    .when ()
    .contentType (ContentType.JSON)
    .delete ("/posts/3");

}
}