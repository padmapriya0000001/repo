package com.Runner.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.utilityfiles.main.Base_Class;

public class Green_Cart extends Base_Class{

	public static void main(String[] args) {
		
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(op);
		launchurl(driver, "https://rahulshettyacademy.com/seleniumPractise/#/");
		maxi(driver);
		WebElement top_deals = driver.findElement(By.xpath("//a[.='Top Deals']"));
		top_deals.click();
		WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("str");
		WebElement cart = driver.findElement(By.xpath("//button[.='ADD TO CART']"));
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
