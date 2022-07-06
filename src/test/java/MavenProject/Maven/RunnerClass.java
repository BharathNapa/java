package MavenProject.Maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pageobjectmanager.PageObjectManager;

import properties.FileReaderManager;

public class RunnerClass extends BaseClass {

public static WebDriver driver = webBrowser("chrome");

	public static PageObjectManager pom = new PageObjectManager(driver); 

	public static void main(String[] args) throws InterruptedException, IOException {

	
		
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().getUrl();

		getUrl(url);

        String username = FileReaderManager.getInstanceFRM().getInstanceCR().getUsername();
        
		passValue(pom.getInstanceLogin().getUsername(), username);
		
		String password = FileReaderManager.getInstanceFRM().getInstanceCR().getPassword();

		passValue(pom.getInstanceLogin().getPassword(), password);


        
		clickOnElement(pom.getInstanceLogin().getBtn());
	
		String location = FileReaderManager.getInstanceFRM().getInstanceCR().getLocation();
		
		value(pom.getInstanceLogin1().getLocation(), location);
        
//
//
//
//
//		value(pom.getInstanceLogin1().getHotel(), "Hotel Sunshine");
//
//
//		visibleText(pom.getInstanceLogin1().getRoom(), "Super Deluxe");
//
//
//		visibleText(pom.getInstanceLogin1().getNos(),"2 - Two");
//
//
//
//		visibleText(pom.getInstanceLogin1().getAdultRoom(),"2 - Two");
//
//
//		visibleText(pom.getInstanceLogin1().getChildRoom(),"2 - Two");
//
//
//
//		clickOnElement(pom.getInstanceLogin1().getBtn2());
//
//
//
//		clickOnElement(pom.getInstanceLogin2().getBtn3());
//
//
//		clickOnElement(pom.getInstanceLogin2().getBtn4());
//
//
//
//		passValue(pom.getInstanceLogin3().getFirstName(),"Bharath");
//
//
//		passValue(pom.getInstanceLogin3().getLastName(), "Napa");
//
//		passValue(pom.getInstanceLogin3().getAddress(), "new 31 Chennai -21");
//
//		passValue(pom.getInstanceLogin3().getCard(), "1234567890123456");
//
//		visibleText(pom.getInstanceLogin3().getCtype(), "VISA");
//
//		index(pom.getInstanceLogin3().getMonth(), 3);
//
//		index(pom.getInstanceLogin3().getYear(), 12);
//
//		passValue(pom.getInstanceLogin3().getCvv(), "123");
//
//		clickOnElement(pom.getInstanceLogin3().getBtn6());
//

	}
}

	


	
	

