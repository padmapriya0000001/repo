package com.demo.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Hotelbookingsample {
	
	public static void main(String[] args) throws IOException {
		
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(op);
	driver.get("https://www.adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("Akilan123");
	WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("Testing@123");
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	WebElement location = driver.findElement(By.id("location"));
	Select country= new Select(location);
	country.selectByValue("Adelaide");
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select hotl= new Select(hotel);
    hotl.selectByValue("Hotel Sunshine");
	WebElement room_type = driver.findElement(By.id("room_type"));
	Select room = new Select(room_type);
	room.selectByVisibleText("Double");
	WebElement rooms_Nos = driver.findElement(By.name("room_nos"));
	Select nos= new Select(rooms_Nos);
	nos.selectByIndex(2);
	
	
	WebElement check_in = driver.findElement(By.id("datepick_in"));
	check_in.clear();
	check_in.sendKeys("10/05/2023");
	WebElement check_out = driver.findElement(By.name("datepick_out"));
	check_out.clear();
	check_out.sendKeys("15/05/2023");
	WebElement adult_Room = driver.findElement(By.id("adult_room"));
	Select adult_quan= new Select(adult_Room);
	adult_quan.selectByValue("3");
	WebElement child_Room = driver.findElement(By.xpath("//select[@id='child_room']"));
	Select child_quan= new Select(child_Room);
	child_quan.selectByValue("2");
	WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	search.click();
	WebElement select = driver.findElement(By.xpath("//input[@type='radio']"));
	select.click();
	WebElement cont = driver.findElement(By.xpath("//input[@name='continue']"));
	cont.click();
	WebElement fn = driver.findElement(By.xpath("//input[@name='first_name']"));
	fn.sendKeys("priya");
	WebElement ln = driver.findElement(By.xpath("//input[@name='last_name']"));
	ln.sendKeys("R");
	WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
	address.sendKeys("chennai-48");
	WebElement cc_no = driver.findElement(By.xpath("//input[@name='cc_num']"));
	cc_no.sendKeys("1234567891234567");
	WebElement cc_Type = driver.findElement(By.xpath("//select[@name='cc_type']"));
	Select card_type= new Select(cc_Type);
	card_type.selectByValue("VISA");
	WebElement exp_Mnth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	Select mnth= new Select(exp_Mnth);
	mnth.selectByValue("4");
	WebElement exp_year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	Select year= new Select(exp_year);
	year.selectByValue("2023");
	WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	cvv.sendKeys("345");
	WebElement book_now = driver.findElement(By.xpath("//input[@id='book_now']"));
	book_now.click();
	JavascriptExecutor js= (JavascriptExecutor) driver;
	WebElement my_itinerary = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
	js.executeScript("arguments[0].scrollIntoView();", my_itinerary);
	my_itinerary.click();
	WebElement check_Box = driver.findElement(By.xpath("//input[@value='867241']"));
	check_Box.click();
	WebElement cancel = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
	cancel.click();
    //driver.switchTo().alert().accept();
	WebElement logout = driver.findElement(By.xpath("//a[.='Logout']"));
	logout.click();
	TakesScreenshot ts= (TakesScreenshot) driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("./screenshots/logout.png"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
	}

}
