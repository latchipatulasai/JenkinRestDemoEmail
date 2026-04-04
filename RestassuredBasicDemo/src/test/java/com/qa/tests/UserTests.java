package com.qa.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;
import com.qa.base.BaseTest;

import io.restassured.response.Response;

public class UserTests extends BaseTest {

	// @Test
	public void getUsersTest() {
		given().when().get("users").then().statusCode(200).body("size()", greaterThan(0));
	}

	// @Test
	public void getUsersTest1() {
		String res = given().when().get("todos").body().asString();
		System.out.println(res);
	}

	@Test(priority = 1)
	void createUser() {
		HashMap hm = new HashMap();
		hm.put("title", "demo");
		hm.put("completed", "true");
		int id = given().contentType("application/json").body(hm).when().post("todos").jsonPath().getInt("id");
//		   .then()
//		     .statusCode(201)
//		     .log().all();
//		   
	}
}
