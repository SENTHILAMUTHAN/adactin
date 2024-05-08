package packages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class PaymentPagepojo extends Base{

public  PaymentPagepojo(){
		
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[@id='first_name']") @CacheLookup private WebElement firstName;
@FindBy(xpath="//input[@id='last_name']") @CacheLookup private WebElement lastName;
@FindBy(xpath="//textarea[@id='address']") @CacheLookup private WebElement address;
@FindBy(xpath="//input[@id='cc_num']") @CacheLookup private WebElement ccNum;
@FindBy(xpath="//select[@id='cc_type']") @CacheLookup private WebElement SelectCreditCardType;
@FindBy(xpath="//select[@id='cc_exp_month']") @CacheLookup private WebElement SelectMonth;
@FindBy(xpath="//select[@id='cc_exp_year']") @CacheLookup private WebElement SelectYear;
@FindBy(xpath="//input[@id='cc_cvv']") @CacheLookup private WebElement ccCvv;
@FindBy(xpath="//input[@id='book_now']") @CacheLookup private WebElement bookNow;
@FindBy(xpath="//input[@id='cancel']") @CacheLookup private WebElement cancel;

public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCcNum() {
	return ccNum;
}
public WebElement getSelectCreditCardType() {
	return SelectCreditCardType;
}
public WebElement getSelectMonth() {
	return SelectMonth;
}
public WebElement getSelectYear() {
	return SelectYear;
}
public WebElement getCcCvv() {
	return ccCvv;
}
public WebElement getBookNow() {
	return bookNow;
}
public WebElement getCancel() {
	return cancel;
}












}
