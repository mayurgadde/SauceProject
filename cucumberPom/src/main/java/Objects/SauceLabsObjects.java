package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceLabsObjects {

	@FindBy(xpath="//*[@name='user-name']")
	public WebElement userName ;
	
	@FindBy(xpath="//*[@name='password']")
	public WebElement password ;
	
	@FindBy(xpath="//*[@name='login-button']")
	public WebElement loginbtn ;

	
	@FindBy(xpath="//*[@data-test='error']")
	public WebElement errorMsg;
	

	
}
