package packages;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;





public class Homepagepojo extends Base {

	
	
	public Homepagepojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@aria-label='Sign in']")
	private  WebElement signin;


	public WebElement getSignin() {
		return signin;
	}


		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
