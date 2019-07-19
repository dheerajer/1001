package com.route4me;

import org.testng.annotations.DataProvider;

public class Data {
	
	
	 public void m2(){
		 
	 
	
	//Local inner classes can be abstract or can be final but not both.
	
	// private class LocalInnerClassOne
     {
         //Compile time error
         //Local inner class can't be private
     }

   //  protected class LocalInnerClassTwo
     {
         //Compile time error
         //Local inner class can't be protected
     }

   //  public class LocalInnerClassThree
     {
         //Compile time error
         //Local inner class can't be public
     }}
	private class Data1{
	}
	 
	public Data(String a, String b){
		
		
	}
	 @DataProvider(name = "Authentication")
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "testuser_1", "Test@123" },
	        						{ "testuser_2", "Test@123" },
	        						{ "testuser_3", "Test@123" }};
	 
	  }
	 public void m1(){
		 Data1 d =new Data1();
		 abstract class LocalInnerClassOne{
			  
		  }
		 final class LocalInnerClassOne1{
			  
		  }

		 
		 
	 }
}
