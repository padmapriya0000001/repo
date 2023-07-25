package com.adactinpage.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class book_Hotel {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement fn;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement ln;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement cc;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardtype;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expirymnth;
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expiryyr;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknw;

	public book_Hotel(WebDriver driver) {

		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirymnth() {
		return expirymnth;
	}

	public WebElement getExpiryyr() {
		return expiryyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknw() {
		return booknw;
	}

}
