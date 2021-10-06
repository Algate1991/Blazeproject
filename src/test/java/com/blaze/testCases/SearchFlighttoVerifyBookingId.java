package com.blaze.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.blaze.pageObjects.BookingConfirmationPage;
import com.blaze.pageObjects.ChooseFlight;
import com.blaze.pageObjects.LoginPage;
import com.blaze.pageObjects.PurchaseFlightTicket;

public class SearchFlighttoVerifyBookingId extends BaseClass {
	
	@Test
	public void TC_001_search() throws IOException
	{

		LoginPage lp=new LoginPage(driver);
		lp.selectDepartureCity("Portland");
		lp.selectDestinationCity("London");
		lp.clickFindFlight();
				
		if(driver.getTitle().equals("BlazeDemo - reserve"))
		{
			Assert.assertTrue(true);
			System.out.println("Seach button clicked successfully");
		}
		else
		{
			captureScreen(driver,"search");
			Assert.assertTrue(false);
			System.out.println("Testcase failed");
		}
	 }
	@Test
	public void TC_002_SelectFlight()
	{
		ChooseFlight cp=new ChooseFlight(driver);
		cp.SelectFlight();
		
	}
	@Test
	public void TC_003_PurchaseFlightTicket()
	{
		PurchaseFlightTicket pfp=new PurchaseFlightTicket(driver);
		pfp.enterName("Ragi");
		pfp.enterAddress("L726 Ambattur Chennai");
		pfp.enterCity("Chennai");
		pfp.enterState("TamilNadu");
		pfp.enterZipCode("600077");
		pfp.selectcardType("Visa");
		pfp.enterCCNumber("7768567");
		pfp.enterCCMonth("10");
		pfp.enterCCYear("2021");
		pfp.enterCCHolderName("Algate");
		pfp.clickPurchaseFlightbtn();
	}
	@Test
	public void TC_004_TicketBookingConfirmation()
	{
		BookingConfirmationPage btcp=new BookingConfirmationPage(driver);
		if(btcp.getBookingConfirmationId()!=null)
		{
		System.out.println("Booking is succesfully created with Bookind Id "+ btcp.getBookingConfirmationId() +" and status is "+ btcp.getBookingStatus());
		
		}
		else
		{
			System.out.println("Test case failed and booking not created succesfully");
		}
		
		System.out.println(btcp.getBookingStatus());
	}

}
