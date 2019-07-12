package com.route4me;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClasses {
	
	WebDriver driver;
	
	@Test(priority=1, groups={"admin"})
	public  void testMethod1() {
		System.out.println("####################testMethod1");
		int x=0;
		int y=0;
		System.out.println(x/y);
	}
	
	@Test(priority=2)
	public  void testMethod2() {
		System.out.println("####################testMethod2");
	}
	
	@Test(dependsOnMethods={"testMethod1"})
	public  void testMethod3() {
		System.out.println("####################testMethod3");
		System.out.println();
	}
	
	@Test(groups={"admin"})
	@Parameters({ "sUsername", "sPassword" })
	public  void testMethod4( String uName, String uPwd) {
		System.out.println("####################testMethod4");
		System.out.println("Username:"+uName +" Password"+uPwd);
	
	}
	
	@Test(groups = { "admin" })
	public void testMethod5() {
		System.out.println("####################testMethod5");
		String[] str = { "asagldas" };
		int x = str.length;
		// str.length();
	}
	
	@Test(groups={"user","admin"})
	public  void testMethod6() {
		System.out.println("####################testMethod6");
	}
	
	
	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
		return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_2", "Test@123" }};

	}
	 
	@Test(groups={"user","admin"}, dataProvider = "Authentication")
	public void testMethod7(String uName, String uPwd) {
		System.out.println("####################testMethod7");
		System.out.println("Username:"+uName +" Password"+uPwd);
		
	}
	
	@Test(dataProvider = "Authentication", dataProviderClass=Data.class)
	public void testMethod8(String uName, String uPwd) {
		System.out.println("####################testMethod8");
		System.out.println("Username:"+uName +" Password"+uPwd);
		
	}
	
	@Test(enabled=false)
	public void testMethod9() {
		System.out.println("####################testMethod9");
	}

	@Test
	public  void testMethod() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
   	driver.get("https://www.softwaretestingmaterial.com/testng-introduction/");
		
	
}
	public void winhand() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/");
		List<WebElement> we=driver.findElements(By.xpath("//div[@class='soc-ico show-on-desktop in-top-bar-right in-menu-second-switch"
		+ " custom-bg disabled-border border-off hover-accent-bg hover-disabled-border  hover-border-off first last']/a"));
		int cnt=we.size();
		for(int i=0;i<cnt;i++) {
		we.get(i).click();

          

		}
		
		Set<String> winhandle=driver.getWindowHandles(); 
		for(String handle1:winhandle){
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().window(handle1);
		String title=driver.getTitle();
		System.out.println(title);
		
		if (title.equalsIgnoreCase("TOOLSQA - powered by FeedBurner")){
			break;
		}else{
			System.out.println("error");
		}
		}
		driver.findElement(By.id("browserfriendly")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}	
}
