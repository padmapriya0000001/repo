package com.Runner.test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Date_PickerMine {

	public static void main(String[] args) {

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		ops.addArguments("--disable-notification");
		ops.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.studysection.com/mock-interview");
		driver.findElement(By.id("interview_date")).click();

		List<WebElement> Activedates = driver
				.findElements(By.xpath("//table[@class='ui-"
						+ "datepicker-calendar']/tbody/tr/td"));
		// div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfixui-corner-all']
		// table[@class='ui-datepicker-calendar']/tbody/tr/td
		for (WebElement dates : Activedates) {
			String date = dates.getText();
			if (date.equals("26")) {
				dates.click();
				break;
			} else {
				continue;

			}

		}

	}

}
