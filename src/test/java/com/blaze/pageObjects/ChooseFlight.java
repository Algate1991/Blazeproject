package com.blaze.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseFlight {
	
	WebDriver ldriver;
	
	public ChooseFlight(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//td[text()='43']/preceding-sibling::td")
	WebElement btnChooseFlight;
	
	public void SelectFlight()
	{
		btnChooseFlight.click();
	}


	
}
