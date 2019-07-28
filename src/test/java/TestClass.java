import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void testMethod() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("samsung mobile");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		List <WebElement> we=driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
         int cnt=we.size();
         System.out.println(cnt);
         
         for(int i=0;i<=cnt-1;i++){
         String  wee=we.get(i).getText();
         System.out.println(wee);
        // we.get(i).click();
	}
         if (cnt==20){
        	 driver.findElement(By.xpath("//li[@class='a-last']/a]")).click();
        	 
         }else{
        	 System.out.println("not click");
         }
       driver.quit();
}
		
}