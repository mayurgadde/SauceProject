package stepDefs;
import actions.SauceLabsCheckoutActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SauceLabsCheckoutStepdefs {
	String productName;
	String productPrice;
	
	SauceLabsCheckoutActions hm = new SauceLabsCheckoutActions(Hooks.driver);
	@Given("user launch the application")
	public void user_launch_the_application() {
		Hooks.driver.get("https://www.saucedemo.com/");
	}
	@When("user enter username  as {string}")
	public void user_enter_username_as(String string1) {
		hm.enterUserName(string1);
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String string2) {
		hm.enterPassword(string2);
	}
	

	@When("user click on login button")
	public void user_click_on_login_button() {
	    hm.clickLoginBtn();
	}

	@Then("user get namd and price of first availaible item")
	public void user_get_namd_and_price_of_first_availaible_item() {
	   productName = hm.getProductName();
	  productPrice=  hm.getProductPrice();
	}

	@Then("user click on add to cart btn")
	public void user_click_on_add_to_cart_btn() {
		hm.clickAddToCart();
	}

	@Then("user navigate to cart")
	public void user_navigate_to_cart() {
	    hm.openCart();
	}

	@Then("user continue to checkout teh item")
	public void user_continue_to_checkout_teh_item() {
			
	}

	@Then("user fill the details for delivery")
	public void user_fill_the_details_for_delivery() throws InterruptedException {
		Thread.sleep(3000);
	    hm.checkout();
	}

	@Then("user verfiy the confirmation message")
	public void user_verfiy_the_confirmation_message() {
	  Assert.assertEquals(productName, hm.getActualProductName());
	  Assert.assertEquals(productPrice, hm.getActualProductPrice());
	   Assert.assertEquals("Thank you for your order!",  hm.verifyConfirmationMessage()); 
	}
	
}
