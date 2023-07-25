package com.demo.practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class window_handle {
	
	
	public static void main(String[] args) {
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(op);
		driver.get("http://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
