package com.Runner.test;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.adactinpage.main.Booking_Confirmation;
import com.adactinpage.main.Login_Pg;
import com.adactinpage.main.Select_Hotel;
import com.adactinpage.main.book_Hotel;
import com.adactinpage.main.search_Hotelpg;
import com.utilityfiles.main.Base_Class;

public class Adactin extends Base_Class {

	public static void main(String[] args) throws IOException {

		ChromeOptions op = new ChromeOptions();
        op.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(op);
		
		Login_Pg lp = new Login_Pg(driver);
		search_Hotelpg sh = new search_Hotelpg(driver);
		Select_Hotel shh = new Select_Hotel(driver);
		book_Hotel bk = new book_Hotel(driver);
		Booking_Confirmation bc = new Booking_Confirmation(driver);

		launchurl(driver, "https://www.adactinhotelapp.com/");
		maxi(driver);
		timeouts(driver, 5);
		send_Keys(lp.getUn(), "Akilan123");
		send_Keys(lp.getPs(), "Testing@123");
		click(lp.getLgn());

		select_value(sh.getLocation(), "Adelaide");
		select_value(sh.getHotels(), "Hotel Sunshine");
		select_text(sh.getRoom_type(), "Double");

		select_index(sh.getRoom_nos(), 2);
		send_Keys(sh.getCheckin(), "15/06/2023");
		send_Keys(sh.getCheckout(), "18/06/2023");
		select_value(sh.getAdult(), "3");
		select_value(sh.getChildren(), "2");
		click(sh.getSearch());
		click(shh.getRadio_btn());
		click(shh.getCont());

		send_Keys(bk.getFn(), "priya");
		send_Keys(bk.getLn(), "r");
		send_Keys(bk.getAddress(), "ryte7uydqvjjdhqwjdhqjd");
		send_Keys(bk.getCc(), "5436782345671656");
		select_value(bk.getCardtype(), "VISA");
		select_value(bk.getExpirymnth(), "4");
		select_value(bk.getExpiryyr(), "2025");
		send_Keys(bk.getCvv(), "443");
		click(bk.getBooknw());

		scroll(driver, bc.getMyitinery());
		js_Click(driver, bc.getMyitinery());
		click(bc.getChkall());
		click(bc.getCancel_Selected());
		alert_accept(driver);
		click(bc.getLogout());
		screenshot(driver, "C:\\Users\\DELL\\eclipse-workspace\\Selenium_project\\screenshots\\image.png");

	}

}
