package packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotelpojo extends Base{
	
public Selecthotelpojo(){
		
		PageFactory.initElements(driver, this);
	}
	





@FindBy(xpath="//input[@id='radiobutton_0']") @CacheLookup private WebElement radiobutton;
@FindBy(xpath="//input[@id='continue']") @CacheLookup private WebElement continuebutton;
@FindBy(xpath="//input[@id='cancel']") @CacheLookup private WebElement cancelbutton;

public WebElement getRadiobutton() {
	
	return radiobutton;
}
public WebElement getContinuebutton() {
	return continuebutton;
}
public WebElement getCancelbutton() {
	return cancelbutton;
}






	
	

}
