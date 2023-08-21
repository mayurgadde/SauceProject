package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Objects.SauceLabsObjects;

public class SauceLabsActions {

	SauceLabsObjects sauceOb ;
	
	
	public  SauceLabsActions(WebDriver driver) {
		sauceOb = PageFactory.initElements(driver,SauceLabsObjects.class);
	}
	public void enterUsername(String userValue) {
		sauceOb.userName.sendKeys(userValue);
	}
	
	public void enterPassword(String passValue) {
		sauceOb.password.sendKeys(passValue);
	}
	public void clickLoginBtn() {
		sauceOb.loginbtn.click();
	}
	
	public String getErrorMsg() {
		String m = sauceOb.errorMsg.getText();
		return m;
	}
}
