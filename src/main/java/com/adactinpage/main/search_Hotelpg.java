package com.adactinpage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_Hotelpg {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement room_type;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement room_nos;
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkin;
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkout;
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult;
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement children;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement search;
	
	public search_Hotelpg(WebDriver driver) {
	
	this.driver= driver;
	PageFactory.initElements(driver, this);
	
	}
	
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChildren() {
		return children;
	}
	public WebElement getSearch() {
		return search;
	}	
	
	
	

}
