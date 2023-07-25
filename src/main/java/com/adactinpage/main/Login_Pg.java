package com.adactinpage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pg {
	
	public static WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement un;
	@FindBy(name = "password")
	private WebElement ps;
	@FindBy(id = "login")
	private WebElement lgn;
	
	
	public Login_Pg(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	public WebElement getUn() {
		return un;
	}
	public WebElement getPs() {
		return ps;
	}
	public WebElement getLgn() {
		return lgn;
	}
	
}
