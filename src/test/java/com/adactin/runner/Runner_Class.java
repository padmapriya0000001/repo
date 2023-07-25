package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature", 
glue = "com.adactin.sd",
dryRun = false,
publish = true,
monochrome = true,
plugin = {"html:Report/rep.html","pretty"}
		)
//,tags="@AD3"

public class Runner_Class {

	public static WebDriver driver;//null

	@BeforeClass
	public static void start() {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);

	}
	
	@AfterClass
	public static void end() {
//		driver.quit();
	}

}
