import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;






public class WindowHandel {
	protected WebDriver driver;
	@Test
	public void string(){
		
		
		
		String b="dheeraj yadav";
		String str=b.replaceAll(b, "yadav");
		System.out.println(str);
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
