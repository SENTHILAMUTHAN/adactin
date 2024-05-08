package packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Confirmationpagepojo extends Base {
	
	public Confirmationpagepojo() {
		PageFactory.initElements(driver, this);
	}
	


@FindBy(xpath="/html[1]/body[1]/table[2]/tbody[1]/tr[2]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]") @CacheLookup private WebElement hotelName;
@FindBy(xpath="/html[1]/body[1]/table[2]/tbody[1]/tr[2]/td[1]/form[1]/table[1]/tbody[1]/tr[3]/td[1]") @CacheLookup private WebElement location;
@FindBy(xpath="/html[1]/body[1]/table[2]/tbody[1]/tr[2]/td[1]/form[1]/table[1]/tbody[1]/tr[4]/td[1]") @CacheLookup private WebElement roomType;
@FindBy(xpath="/html[1]/body[1]/table[2]/tbody[1]/tr[2]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[1]") @CacheLookup private WebElement arrivalDate;
@FindBy(xpath="//tbody/tr[7]/td[1]") @CacheLookup private WebElement departureDate;
@FindBy(xpath="//tbody/tr[8]/td[1]") @CacheLookup private WebElement totalRooms;
@FindBy(xpath="//tbody/tr[9]/td[1]") @CacheLookup private WebElement adultsPerRoom;
@FindBy(xpath="//tbody/tr[10]/td[1]") @CacheLookup private WebElement childrenPerRoom;
@FindBy(xpath="//tbody/tr[11]/td[1]") @CacheLookup private WebElement pricePerNight;
@FindBy(xpath="//tbody/tr[12]/td[1]") @CacheLookup private WebElement totalPrice;
@FindBy(xpath="//tbody/tr[13]/td[1]") @CacheLookup private WebElement gST;
@FindBy(xpath="//tbody/tr[15]/td[1]") @CacheLookup private WebElement firstName;
@FindBy(xpath="//tbody/tr[14]/td[1]") @CacheLookup private WebElement finalBilledPrice;
@FindBy(xpath="//tbody/tr[17]/td[1]") @CacheLookup private WebElement billingAddress;
@FindBy(xpath="//tbody/tr[18]/td[1]") @CacheLookup private WebElement orderNo;
@FindBy(xpath="//input[@id='search_hotel']") @CacheLookup private WebElement searchHotel;
@FindBy(xpath="//input[@id='my_itinerary']") @CacheLookup private WebElement myItinerary;
@FindBy(xpath="//input[@id='logout']") @CacheLookup private WebElement logout;



public WebElement getHotelName() {
	return hotelName;
}
public WebElement getLocation() {
	return location;
}
public WebElement getRoomType() {
	return roomType;
}
public WebElement getArrivalDate() {
	return arrivalDate;
}
public WebElement getDepartureDate() {
	return departureDate;
}
public WebElement getTotalRooms() {
	return totalRooms;
}
public WebElement getAdultsPerRoom() {
	return adultsPerRoom;
}
public WebElement getChildrenPerRoom() {
	return childrenPerRoom;
}
public WebElement getPricePerNight() {
	return pricePerNight;
}
public WebElement getTotalPrice() {
	return totalPrice;
}
public WebElement getgST() {
	return gST;
}
public WebElement getFirstName() {
	return firstName;
}
public WebElement getFinalBilledPrice() {
	return finalBilledPrice;
}
public WebElement getBillingAddress() {
	return billingAddress;
}
public WebElement getOrderNo() {
	return orderNo;
}
public WebElement getSearchHotel() {
	return searchHotel;
}
public WebElement getMyItinerary() {
	return myItinerary;
}
public WebElement getLogout() {
	return logout;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
