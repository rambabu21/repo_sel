package pom_framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class POM_Objecrs {
	
	@FindBy(id="divPassword") WebElement un;
	@CacheLookup
	
	@FindBy(id="txtPassword") WebElement psd;
	@CacheLookup
	
	@FindBy(id="btnLogin") WebElement login;
   // @CacheLookup
    
public void loginApp(String user,String passwd) {
	un.sendKeys(user);
	psd.sendKeys(passwd);
	login.click();
}
    
}