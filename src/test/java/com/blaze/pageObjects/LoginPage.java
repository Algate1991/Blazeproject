package com.blaze.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="fromPort")
	WebElement departureCity;
	
	@FindBy(name="toPort")
	WebElement destinationCity;
	
	@FindBy(xpath="//input[@value='Find Flights']")
	WebElement btnFindFlights;
	
	
	public void selectDepartureCity(String depcity) 
	{
		Select from=new Select(departureCity);
		from.selectByVisibleText(depcity);
	}
	public void selectDestinationCity(String desticity)
	{
		Select to=new Select(destinationCity);
		to.selectByVisibleText(desticity);
	}
	public void clickFindFlight()
	{
		btnFindFlights.click();
	}

}
