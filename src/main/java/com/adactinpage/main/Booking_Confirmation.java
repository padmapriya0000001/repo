package com.adactinpage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
	
	public static WebDriver driver;

	@FindBy(xpath = "//a[.='Booked Itinerary']")
	private WebElement myitinery;
	@FindBy(xpath = "//input[@name='check_all']")
	private WebElement chkall;
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement cancel_Selected;
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logout;

	public Booking_Confirmation(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyitinery() {
		return myitinery;
	}

	public WebElement getChkall() {
		return chkall;
	}
	public WebElement getCancel_Selected() {
		return cancel_Selected;
	}
	public WebElement getLogout() {
		return logout;
	}

}
