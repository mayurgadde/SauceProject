package stepDefs;

import org.junit.Assert;

import actions.SauceLabsActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Saucelabs {

	SauceLabsActions sauceAct = new SauceLabsActions(Hooks.driver);
	@Given("user launch the application with {string}")
	public void user_launch_the_application_with(String string) {
	    Hooks.driver.get(string);
	}
	@When("user enter the valid username {string}")
	public void user_enter_the_valid_username(String string1) {
	   sauceAct.enterUsername(string1);
	}

	@And("user enter valid password {string}")
	public void user_enter_valid_password(String string2) {
	   sauceAct.enterPassword(string2);
	}

	@And("user click on submit button")
	public void userclickOnButton() {
	sauceAct.clickLoginBtn();  
	}

	@Then("user should be able to logged in successfully")
	public void user_should_be_able_to_logged_in_successfully() {
		System.out.println(Hooks.driver.getTitle());
	    Assert.assertEquals("Swag Labs", Hooks.driver.getTitle());
	}
	
	@When("user enter the invalid username {string}")
	public void user_enter_the_invalid_username(String string3) {
		sauceAct.enterUsername(string3);
	}

	@And("user enter  the invalid password {string}")
	public void user_enter_the_invalid_password(String string4) {
		sauceAct.enterPassword(string4);
	}

	@And("user click the submit button")
	public void user_click_the_submit_button() {
		sauceAct.clickLoginBtn();
	}

	
	@Then("user should see some error msg")
	public void user_shlould_see_some_error_msg() throws InterruptedException  {
	    Thread.sleep(5000);
	    Assert.assertEquals("Epic sadface: Username and password do not match any user in this service" , sauceAct.getErrorMsg());
	}

	
}