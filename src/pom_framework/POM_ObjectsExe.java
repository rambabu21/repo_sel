package pom_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class POM_ObjectsExe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com/");
	    driver.manage().window().maximize();           
	    POM_Objects obj=PageFactory.initElements(driver,  POM_Objects.class);	    
        obj.loginApp("admin","admin");
	}

}
