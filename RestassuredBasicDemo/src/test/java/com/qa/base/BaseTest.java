package com.qa.base;

import io.restassured.RestAssured; // ✅ This import is required
import org.testng.annotations.BeforeClass;

public class BaseTest {
	@BeforeClass
	public void setup() {
		// Use a real public API
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	}
}
