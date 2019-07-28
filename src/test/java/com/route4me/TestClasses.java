package com.route4me;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestClasses {
	
	@Test(alwaysRun = true)
	public void testMethod11() {
		System.out.println("####################testMethod1");
		int x = 0;
		int y = 0;
		System.out.println(x / y); 
		
		
		
		
	}
	@Test
	public void testMethod12() {
		System.out.println("####################testMethod12");
		int x = 0;
		int y = 0;
		System.out.println(x / y); 
	}
	@Test(priority = 1, groups =  {"admin"})
	public void testMethod1() {
		System.out.println("####################testMethod1");
		int x = 0;
		int y = 0;
		System.out.println(x / y); 
	}

	@Test(priority = 2)
	public void testMethod2() {
		System.out.println("####################testMethod2");
		
	}

	@Test(dependsOnMethods = { "testMethod1" })
	public void testMethod3() {
		System.out.println("####################testMethod3");
		System.out.println();
	}

	@Test(groups = { "admin" })
	@Parameters({ "sUsername", "sPassword","username","userpass" })
	public void testMethod4(String uName, String uPwd ,String user,String pass) {
		System.out.println("####################testMethod4");
		System.out.println("Username:" + uName + " Password" + uPwd+user+pass);

	}

	@Test(groups = { "admin" })
	public void testMethod5() {
		System.out.println("####################testMethod5");
		String[] str = { "asagldas" };
		int x = str.length;
		// str.length();
	}

	@Test(groups = { "user", "admin" })
	public void testMethod6() {
		System.out.println("####################testMethod6");
	}

	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
		return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_2", "Test@123" } };

	}

	@Test(groups = { "user", "admin" }, dataProvider = "Authentication")
	public void testMethod7(String uName, String uPwd) {
		System.out.println("####################testMethod7");
		System.out.println("Username:" + uName + " Password" + uPwd);

	}

	@Test(dataProvider = "Authentication", dataProviderClass = Data.class)
	public void testMethod8(String uName, String uPwd) {
		System.out.println("####################testMethod8");
		System.out.println("Username:" + uName + " Password" + uPwd);

	}

	@Test(enabled = false)
	public void testMethod9() {
		System.out.println("####################testMethod9");
	}
	
	
	@Test(alwaysRun=true)
	public void testMethod10() {
		System.out.println("####################testMethod10");
	}

	@Test(invocationCount = 5)
	public void testMethod() {
		
		
		System.out.println("dheeraj");
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.softwaretestingmaterial.com/testng-introduction/");

	}

	//@Test(expectedExceptions = { IOException.class, NullPointerException.class })
	@Test
	public void gotoUrl() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/testng-introduction/");
		
		
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		//WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Training')]"));
		WebDriverWait wait=new WebDriverWait(driver, 2);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='s']"))).sendKeys("Ankit");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Training']"))).click();
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    wait.until(ExpectedConditions.alertIsPresent());

	}
}
