

	import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class BaseClass {


	
		
		protected WebDriver driver;
		
		public void waitAndClick(WebElement element) {
			
			element.click();
			
			
			
		}
		public void click(WebElement element){
			element.click();
		}
		
		public WebDriver getDriver(){
			return driver;
			
		}
		

		/**
		 * 
		 * @param element
		 */
		

		/**
		 * switchToFrame by id or name
		 */
		public void switchToFrame(String id) {
			getDriver().switchTo().frame(id);
		}

		/**
		 * switchTo default main Content
		 */
		public void switchToMainContents() {
			getDriver().switchTo().defaultContent();
		}
		
		public void switchToNewWindow() {
			Set<String> windowHandel=getDriver().getWindowHandles();
			for(String handel:windowHandel){
				getDriver().switchTo().window(handel);
			}
			
			
		}

		/**
		 * switchTo Default window
		 */
		public void switchToDefaultWindow() {
			
			ArrayList<String> newTab = new ArrayList<String>(getDriver().getWindowHandles());
			getDriver().switchTo().window(newTab.get(0));
		}

		/**
		 * Click on element by webelement
		 */
		public void javascriptButtonClick(WebElement webElement) {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", webElement);
			
		}
		


	

}



