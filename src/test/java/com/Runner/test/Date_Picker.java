package com.Runner.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.utilityfiles.main.Base_Class;

public class Date_Picker extends Base_Class {

	public static void main(String[] args) throws InterruptedException, AWTException {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		launchurl(driver, "https://www.makemytrip.com/");
		maxi(driver);
		timeouts(driver, 5000);
		Thread.sleep(7000);

		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@id,'webklipper-publisher-widget')]"));

		driver.switchTo().frame(frame);

		WebElement close = driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']"));

		close.click();
		
//		driver.findElement(By.xpath("//span[@data-cy='handleSnackbarClose']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//li[.='Round Trip']")).click();

		driver.findElement(By.id("fromCity")).click();

		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("Chennai");

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);

		r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		driver.findElement(By.id("toCity")).click();
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.sendKeys("Bangkok");

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Wed Jun 21 2023')]")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Jun 22 2023')]")).click();

//		String flag = "False";
//
//		while (flag == "False") {
//
//			if (driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Wed Jun 21 2023')]"))
//					.size() > 0) {
//
//				WebElement date = driver.findElement(
//						By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Wed Jun 21 2023')]"));
//
//				js_Click(driver, date);
//
//				flag = "True";
//				Thread.sleep(5000);
//			}
//
//			else {
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
//			}
//
//			// return
//
//			if (driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Jun 22 2023')]"))
//					.size() > 0) {
//				// System.out.println("If");
//				WebElement date = driver.findElement(
//						By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Jun 22 2023')]"));
//
//				js_Click(driver, date);
//
//				flag = "True";
//				Thread.sleep(8000);
//			}
//
			WebElement click = driver.findElement(By.xpath("//span[contains(text(),'Travellers & Class')]"));
			js_Click(driver, click);
			driver.findElement(By.xpath("//li[@data-cy='adults-1']")).click();
			driver.findElement(By.xpath("//li[@data-cy='children-0']")).click();
			driver.findElement(By.xpath("//li[@data-cy='infants-0']")).click();
			driver.findElement(By.xpath("//li[@data-cy='travelClass-0']")).click();
			driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
			driver.findElement(By.xpath("//a[.='Search']")).click();

			Thread.sleep(5000);
			WebElement btn = driver.findElement(By.xpath("//button[.='OKAY, GOT IT!']"));
			btn.click();
			driver.findElement(By.xpath("(//input[@id='listingFilterCheckbox'])[3]")).click();			// driver.findElement(By.xpath("(//input[@id='listingFilterCheckbox'])[6]")).click();

			WebElement slider = driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));
		
			int slidersizewidth = slider.getSize().width;
			Actions a = new Actions(driver);
			a.clickAndHold(slider);
		
			a.moveByOffset(70, 0).build().perform();
	        a.moveByOffset(70, 0).release().perform();
			for (int i = 0; i < 7; i++) {
				r.keyPress(KeyEvent.VK_LEFT);
				r.keyRelease(KeyEvent.VK_LEFT);

			}
////			WebElement slider2 = driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[2]"));
////			int slidersizeewidth = slider.getSize().width;
////			a.clickAndHold(slider2);
////			a.moveByOffset(40, 0).build().perform();
////			for (int i = 0; i < 7; i++) {
////				r.keyPress(KeyEvent.VK_LEFT);
////				r.keyRelease(KeyEvent.VK_LEFT);
////
////			}
//		}
//
		driver.findElement(By.xpath("(//span[@class='appendBottom2 checkBlockIcon'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='appendBottom2 checkBlockIcon'])[7]")).click();
		driver.findElement(By.xpath("(//span[.='View Prices'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(@class,'buttonPrimary ')]")).click();
//		/driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		Thread.sleep(8000);

		String parent_id = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();

		// String expectedurl=
		// "https://www.makemytrip.com/flight/reviewDetails/?itineraryId=01cf0994c100deaffc02f675219a5218ed7e011f&crId=9a22e64d-4c81-46c7-b503-de2b71a8994d&cur=INR&rKey=RKEY:17e2a02a-15f9-4ba1-ad0c-5238d8a21a4f:16_0&ccde=IN&xflt=eyJjIjoiRSIsInAiOiJBLTNfQy0yX0ktMSIsInQiOiIiLCJzIjoiTUFBLUJLSy0yMDIzMDYyMSRCS0stTUFBLTIwMjMwNjIyIn0=";
		for (String id : all) {
			if (id.equals(parent_id)) {
				continue;
			} else {
				driver.switchTo().window(id);
			}

			WebElement scroll = driver.findElement(By.xpath("//font[.='International']"));
			scroll(driver, scroll);
			WebElement radio = driver.findElement(By.xpath("//span[contains(.,'Yes,')]"));
			radio.click();
			// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			WebElement firstpassenger = driver.findElement(By.xpath("//button[@class='addTravellerBtn']"));
			scroll(driver, firstpassenger);
			js_Click(driver, firstpassenger);
		driver.findElement(By.xpath("//input[@placeholder='First & Middle Name']")).sendKeys("priya");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("sdfsdsf");
		driver.findElement(By.xpath("//input[@value='FEMALE']")).click();
			driver.findElement(By.xpath("//div[contains(@class,'dropdown__value')]")).click();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			driver.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys("9789135267");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("padmapriyaravikumar04@gmail.com");
//			r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//			WebElement pincode = driver.findElement(By.xpath("//input[@id='pincode_gst_info']"));
//			pincode.clear();
//			pincode.sendKeys("600048");
//
////			WebElement state = driver.findElement(By.xpath("//input[@value='Tamil Nadu']"));
////			state.sendKeys("tam");
////			select_index(to, 0)
//			WebElement address = driver.findElement(By.xpath("//input[@placeholder='Your Address']"));
////			js_sendkey(driver, address);
//			js_sendkey(driver, address, "arguments[0].value='no 7'");
//
//			driver.findElement(By.xpath("//span[@class='checkboxWpr']")).click();
//			driver.findElement(By.xpath("//button[.='Continue']")).click();
//driver.findElement(By.xpath("//div[@class='imageSlideContainer']")).click();
}

	}
}
