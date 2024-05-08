package packages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class Loginpojo extends Base {
	
	
	public Loginpojo(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	private WebElement emailid;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginbtn;
	
	
	@FindBy(xpath="//strong[normalize-space()='Go to Build 2']")
	private WebElement build2;
	

	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}


	public WebElement getBuild2() {
		return build2;
	}


	public WebElement getEmailid() {
		return emailid;
	}
	
	

}
