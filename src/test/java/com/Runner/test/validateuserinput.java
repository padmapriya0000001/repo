package com.Runner.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.utilityfiles.main.Base_Class;

public class validateuserinput extends Base_Class {

	public static void main(String[] args) throws Exception {

//		ChromeOptions op = new ChromeOptions();
//		op.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(op);
//		launchurl(driver, "https://www.hyrtutorials.com/p/calendar-practice.html");
//		maxi(driver);
		String dt = "30/09/2023";
		SimpleDateFormat targetDate = new SimpleDateFormat("dd/MM/yyyy");
//		Date formattedtargetdate = Targetdateformat.parse(targetdate);
		String format = targetDate.format(dt);
		System.out.println(format);
		

	}

}
