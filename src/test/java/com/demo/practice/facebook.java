package com.demo.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(op);
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("rpadma2@gmail.com");
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("1234567788");
//		WebElement login = driver.findElement(By.id("loginbutton"));
//		login.click();
//		driver.navigate().refresh();
		WebElement sign_up = driver.findElement(By.xpath("//a[.='Sign up for Facebook']"));
		sign_up.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.sendKeys("priya");
		WebElement ln = driver.findElement(By.xpath("//input[@name='lastname']"));
		ln.sendKeys("r");
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("4567889932225");
		WebElement new_pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		new_pass.sendKeys("434344344");
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d= new Select(date);
		d.selectByValue("10");
		WebElement mnth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m= new Select(mnth);
		m.selectByValue("8");
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y= new Select(year);
		y.selectByValue("2015");
		WebElement sex = driver.findElement(By.xpath("//input[@name='sex']"));
		sex.click();
		WebElement sign_Up = driver.findElement(By.xpath("(//button[.='Sign Up'])[1]"));
		sign_up.click();
		
		
		
		
		
		
		
		
	}

}
