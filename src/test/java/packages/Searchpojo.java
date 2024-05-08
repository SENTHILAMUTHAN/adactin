package packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpojo extends Base {
	
public Searchpojo(){
		
		PageFactory.initElements(driver, this);
	}
	

@FindBy(xpath="//select[@id='location']") 
@CacheLookup 
private WebElement SelectLocation;


@FindBy(xpath="//select[@id='hotels']") 
@CacheLookup 
private WebElement SelectHotel;


@FindBy(xpath="//select[@id='room_type']") @CacheLookup private WebElement SelectRoomType;

@FindBy(xpath="//select[@id='room_nos']") @CacheLookup private WebElement SelectNumberOfRooms;

@FindBy(xpath="//input[@id='datepick_in']") @CacheLookup private WebElement datepickIn;

@FindBy(xpath="//input[@id='datepick_out']") @CacheLookup private WebElement datepickOut;

@FindBy(xpath="//select[@id='adult_room']") @CacheLookup private WebElement SelectAdultsPerRoom;

@FindBy(xpath="//select[@id='child_room']") @CacheLookup private WebElement SelectChildrenPerRoom;

@FindBy(xpath="//input[@id='Submit']") @CacheLookup private WebElement submit;

@FindBy(xpath="//input[@id='Reset']") @CacheLookup private WebElement reset;



public WebElement getSelectLocation() {
	return SelectLocation;
}

public WebElement getSelectHotel() {
	return SelectHotel;
}

public WebElement getSelectRoomType() {
	return SelectRoomType;
}

public WebElement getSelectNumberOfRooms() {
	return SelectNumberOfRooms;
}

public WebElement getDatepickIn() {
	return datepickIn;
}

public WebElement getDatepickOut() {
	return datepickOut;
}

public WebElement getSelectAdultsPerRoom() {
	return SelectAdultsPerRoom;
}

public WebElement getSelectChildrenPerRoom() {
	return SelectChildrenPerRoom;
}

public WebElement getSubmit() {
	return submit;
}

public WebElement getReset() {
	return reset;
}





}
