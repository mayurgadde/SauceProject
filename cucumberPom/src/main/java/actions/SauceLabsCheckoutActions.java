package actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Objects.SauceLabsCheckoutObjects;
public class SauceLabsCheckoutActions {
	SauceLabsCheckoutObjects homeObj;
	Actions act;
	
	public SauceLabsCheckoutActions(WebDriver driver) {
		homeObj = PageFactory.initElements(driver, SauceLabsCheckoutObjects.class);
		act = new Actions(driver);
	}
	
	public void enterUserName(String s1) {
		homeObj.userName.sendKeys(s1);
	}
	
	public void enterPassword(String s2) {
		homeObj.password.sendKeys(s2);
	}
	
	public void clickLoginBtn() {
		homeObj.loginBtn.click();
	}
	
	public String getProductName() {
		
		return homeObj.productName.getText();
	}
	
	public String getProductPrice() {
		return homeObj.productPrice.getText();
	}
	
	public void clickAddToCart() {
		homeObj.addToCartBtn.click();
	}
	
	public void openCart() {
		homeObj.cartBtn.click();
	}
	
	public void checkout() {
		homeObj.checkout.click();
		homeObj.firstName.sendKeys("gfgf");
		homeObj.lastName.sendKeys("fgfdty");
		homeObj.postalCode.sendKeys("6576");
		homeObj.continueBtn.click();
	}
	
	public String getActualProductName() {
		return homeObj.actualProductName.getText();
	}
	
	public String getActualProductPrice() {
		return homeObj.actualProductPrice.getText();
	}
	
	public String verifyConfirmationMessage() {
		homeObj.finishBtn.click();
	return	homeObj.confirmationMsg.getText();
	}
}
