package com.blaze.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage {
	
	WebDriver ldriver;
	
	public BookingConfirmationPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//td[text()='Id']/following-sibling::td")
	WebElement bookingconfirmationId;
	
	@FindBy(xpath="//td[text()='Status']/following-sibling::td")
	WebElement bookingStatus;
	
	public String getBookingConfirmationId()
	{
		return bookingconfirmationId.getText();
	}
	public String getBookingStatus()
	{
		return bookingStatus.getText();
	}

}
