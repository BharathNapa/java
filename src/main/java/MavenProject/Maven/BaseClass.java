package MavenProject.Maven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	

	public static WebDriver driver;
	
	public static WebDriver webBrowser(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\Newchromedriver.exe");
		
	driver = new ChromeDriver ();		 
	
	driver.manage().window().maximize();

	}
		
		return driver;
	}
	public static void getUrl(String url) {

		driver.get(url);
		
	}
		
		public static void passValue(WebElement element, String value) {
			
			element.sendKeys(value);
		
	}
		
		public static void clickOnElement(WebElement element) {

			element.click();
		}
		
		public static void index (WebElement element , int value)  {
			 
		     Select s = new Select(element);
		     
		     s.selectByIndex(value);
		     }
		
		public static void value (WebElement element, String value) {
			
			Select s = new Select(element);
			
			s.selectByValue(value);
	}

		
	public static void visibleText (WebElement element, String value) {
		
		Select s = new Select(element);
		
		s.selectByVisibleText(value);
	}
	
	
	public static void screenshotMethod(String location) throws IOException {
       
		TakesScreenshot ts = (TakesScreenshot) driver;
	    
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    
	    File des = new File(location);
	    
	    FileUtils.copyFile(source, des);
	}

	
	
}