package com.blaze.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PurchaseFlightTicket {
	
	WebDriver ldriver;
	
	public PurchaseFlightTicket(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="inputName")
	WebElement name;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="zipCode")
	WebElement zipCode;
	
	@FindBy(id="cardType")
	WebElement cccardType;
	
	@FindBy(id="creditCardNumber")
	WebElement creditCardNumber;
	
	@FindBy(id="creditCardMonth")
	WebElement ccMonth;
	
	@FindBy(id="creditCardYear")
	WebElement ccYear;
	
	@FindBy(id="nameOnCard")
	WebElement cardHolderName;
	
	@FindBy(xpath="//input[@value='Purchase Flight']")
	WebElement btnPurchaseFlight;
	
	public void enterName(String typename)
	{
		name.sendKeys(typename);
	}
	public void enterAddress(String typeAddress)
	{
		address.sendKeys(typeAddress);
	}	
	public void enterCity(String typecity)
	{
		city.sendKeys(typecity);
	}	
	public void enterState(String typestate)
	{
		state.sendKeys(typestate);
	}	
	public void enterZipCode(String typezipCode)
	{
		zipCode.sendKeys(typezipCode);
	}	
	public void selectcardType(String selectCCType)
	{
		Select CCType=new Select(cccardType);
		CCType.selectByVisibleText(selectCCType);
	}	
	public void enterCCNumber(String typeccnumber)
	{
		creditCardNumber.sendKeys(typeccnumber);
	}	
	public void enterCCMonth(String typemonth)
	{
		ccMonth.sendKeys(typemonth);
	}
	public void enterCCYear(String typeyear)
	{
		ccYear.sendKeys(typeyear);
	}
	public void enterCCHolderName(String typeccName)
	{
		cardHolderName.sendKeys(typeccName);
	}
	public void clickPurchaseFlightbtn()
	{
		btnPurchaseFlight.click();
	}


}
