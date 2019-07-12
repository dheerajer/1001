package com.route4me;

import org.testng.annotations.DataProvider;

public class Data {

	 @DataProvider(name = "Authentication")
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "testuser_1", "Test@123" },
	        						{ "testuser_2", "Test@123" },
	        						{ "testuser_3", "Test@123" }};
	 
	  }
}
