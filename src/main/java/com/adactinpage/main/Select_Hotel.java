package com.adactinpage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

public static WebDriver driver;


public Select_Hotel(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radio_btn;
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement cont;

	public WebElement getRadio_btn() {
		return radio_btn;
	}

	public WebElement getCont() {
		return cont;
	}

}
