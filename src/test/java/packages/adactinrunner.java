package packages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class adactinrunner extends Base {

	@Test(priority = 1)
	public void initial() throws IOException {
		launchBrowser();
		maximizeWindow();
		Wait();
		openwebpage("http://www.adactin.com/HotelApp/");
		pageTitle();
		 scnsht("homepagebuild1");
		Loginpojo l = new Loginpojo();
		WebElement build2 = l.getBuild2();
		moveTheCursor(build2);

		actionClick(build2);
		 scnsht("homepagebuild2");
		 System.out.println("b1");
	}

	@Test(priority=2)
    public void givingcredentials() throws IOException {
    	Loginpojo l =new Loginpojo();
    	
    	passTheValues(l.getEmailid(), "senthil1234");
    	passTheValues(l.getPassword(), "asdf1234");
    	
    	scnsht("aftergivingcredentials3");
    	moveTheCursor(l.getLoginbtn());
    	actionClick(l.getLoginbtn());
    	
    	scnsht("SearchPage4");
    	
    	Searchpojo s=new Searchpojo();
    	
   
    	WebElement selectLocation = s.getSelectLocation();
    	WebElement selectHotel = s.getSelectHotel();
    	WebElement selectRoomType = s.getSelectRoomType();
    	WebElement selectNumberOfRooms = s.getSelectNumberOfRooms();
    	WebElement selectAdultsPerRoom = s.getSelectAdultsPerRoom();
    	WebElement selectChildrenPerRoom = s.getSelectChildrenPerRoom();
    	
    	 
    	Select location= new Select(selectLocation);
    	location.selectByValue("London");
    	
    	Select  Hotel= new Select(selectHotel);
    	Hotel.selectByValue("Hotel Hervey");
    	
    	
    	Select  Room= new Select(selectRoomType);
    	Room.selectByValue("Double");
    	
    	Select  RoomNum= new Select(selectNumberOfRooms);
    	//moveTheCursor(RoomNum);
    	RoomNum.selectByValue("2");
    	
    	
    	
    	Select Adultnum= new Select(selectAdultsPerRoom);
    	Adultnum.selectByValue("2");
    	
    	
    	
    	Select Childnum= new Select(selectChildrenPerRoom);
    	Childnum.selectByValue("2");
    	scnsht("aftergivingnecessarydetails5");
    	
    	moveTheCursor(s.getSubmit());
    	actionClick(s.getSubmit());
    	
    	
    }
	
	
	@Test(priority=3)
	public void selectinghotel() throws IOException {
		scnsht("SelectingHotelPage6");
		
		Selecthotelpojo sh=new Selecthotelpojo();
		moveTheCursor(sh.getRadiobutton());
		actionClick(sh.getRadiobutton());
		
		scnsht("afterSelectinghotel7");
		
		moveTheCursor(sh.getContinuebutton());
		actionClick(sh.getContinuebutton());
		
		
	}
	
	@Test(priority=4)
	public void payment() throws IOException {
		scnsht("PaymentPage8");
		PaymentPagepojo pp = new PaymentPagepojo();
		
		passTheValues(pp.getFirstName(), "Senthil");
		passTheValues(pp.getLastName(), "Amuthan");
		passTheValues(pp.getAddress(), "Marathahalli, Shamanna Reddy Layout, Kasavanahalli Village, Marathahalli,"
				+ " Bengaluru, Karnataka 560037, India");
		passTheValues(pp.getCcNum(), "4929 1234 5678 9012");
		
		WebElement selectCreditCardType = pp.getSelectCreditCardType();
		Select Cctype = new Select(selectCreditCardType);
		Cctype.selectByValue("VISA");

		WebElement selectMonth = pp.getSelectMonth();
		Select month = new Select(selectMonth);
		month.selectByValue("3");
		
		WebElement selectYear = pp.getSelectYear();
		Select year = new Select(selectYear);
		year.selectByValue("2027");
		
		passTheValues(pp.getCcCvv(), "123");
		
		scnsht("paymentdetails9");
		
    	moveTheCursor(pp.getBookNow());
		actionClick(pp.getBookNow());
		
		Wait();
		
	}
	
	
	@Test(priority=5)
	public void confirmation() throws IOException {
//		Confirmationpagepojo cp= new Confirmationpagepojo();
//		WebElement orderNo = cp.getOrderNo();
//		
//		
//		
//		String orderNumber = orderNo.getText();
//	    
//	    // Now you can use the orderNumber as needed
//	    System.out.println("Order Number: " + orderNumber);
		Wait();
//		
		scnsht("Confirmationpage10");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
