package com.adactin.sd;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Runner_Class;
import com.adactinpage.main.Booking_Confirmation;
import com.adactinpage.main.Login_Pg;
import com.adactinpage.main.Select_Hotel;
import com.adactinpage.main.book_Hotel;
import com.adactinpage.main.search_Hotelpg;
import com.utilityfiles.main.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;
	public static Login_Pg lg = new Login_Pg(driver);
	public static search_Hotelpg sr = new search_Hotelpg(driver);
	public static Select_Hotel sh = new Select_Hotel(driver);
	public static book_Hotel bh = new book_Hotel(driver);
	public static Booking_Confirmation bc = new Booking_Confirmation(driver);

	@Given("User launch the application")
	public void user_launch_the_application() {
		maxi(driver);
		launchurl(driver, "https://www.adactinhotelapp.com/");
	}

	@When("User enter the username in the username field")
	public void user_enter_the_username_in_the_username_field() {
		send_Keys(lg.getUn(), "Akilan123");

	}

	@When("User enter the password in the password field")
	public void user_enter_the_password_in_the_password_field() {
		send_Keys(lg.getPs(), "Testing@123");
	}

	@Then("User click the login btn and navigate to search hotel page")
	public void user_click_the_login_btn_and_navigate_to_search_hotel_page() {
		click(lg.getLgn());
	}

	@When("User select the location in the location field")
	public void user_select_the_location_in_the_location_field() {
		select_index(sr.getLocation(), 1);
	}

	@When("User select the hotel in the hotel field")
	public void user_select_the_hotel_in_the_hotel_field() {
		select_value(sr.getHotels(), "Hotel Sunshine");
	}

	@When("User select the room type in the room type field")
	public void user_select_the_room_type_in_the_room_type_field() {
		select_text(sr.getRoom_type(), "Double");
	}

	@When("User select the no.of rooms in the rooms field")
	public void user_select_the_no_of_rooms_in_the_rooms_field() {
		select_index(sr.getRoom_nos(), 2);
	}

	@When("User clear and select the chk in date in the chk in date field")
	public void user_clear_and_select_the_chk_in_date_in_the_chk_in_date_field() {
		clear(sr.getCheckin());
		send_Keys(sr.getCheckin(), "15/06/2023");
	}

	@When("User clear and select the chk out date in chk out date field")
	public void user_clear_and_select_the_chk_out_date_in_chk_out_date_field() {
		clear(sr.getCheckout());
		send_Keys(sr.getCheckout(), "19/06/2023");
	}

	@When("User select the adults rooms in the adults room field")
	public void user_select_the_adults_rooms_in_the_adults_room_field() {
		select_value(sr.getAdult(), "2");
	}

	@When("User select the child room in the child room field")
	public void user_select_the_child_room_in_the_child_room_field() {
		select_value(sr.getChildren(), "4");
	}

	@Then("User click the search btn and navigate to select hotel page")
	public void user_click_the_search_btn_and_navigate_to_select_hotel_page() {
		click(sr.getSearch());
	}

	@When("User click the radio button in the select field")
	public void user_click_the_radio_button_in_the_select_field() {
		click(sh.getRadio_btn());
	}

	@Then("User click the continue btn and navigate to book hotel page")
	public void user_click_the_continue_btn_and_navigate_to_book_hotel_page() {
		click(sh.getCont());
	}

	@When("User enter the first name in the fn field")
	public void user_enter_the_first_name_in_the_fn_field() {
		send_Keys(bh.getFn(), "priya");
	}

	@When("User enter the last name in the ln field")
	public void user_enter_the_last_name_in_the_ln_field() {
		send_Keys(bh.getLn(), "r");
	}

	@When("User enter the billing add  in the address field")
	public void user_enter_the_billing_add_in_the_address_field() {
		send_Keys(bh.getAddress(), "hsgjfjfbjfbjfbjfb");
	}

	@When("User enter the credit no in the card no field")
	public void user_enter_the_credit_no_in_the_card_no_field() {
		send_Keys(bh.getCc(), "5236253637637135");
	}

	@When("User enter the credit card type  in the cc type field")
	public void user_enter_the_credit_card_type_in_the_cc_type_field() {
		select_index(bh.getCardtype(), 3);
	}

	@When("User enter the expiry mnth in the mnth field")
	public void user_enter_the_expiry_mnth_in_the_mnth_field() {
		select_value(bh.getExpirymnth(), "4");
	}

	@When("User enter the expiry year in the year field")
	public void user_enter_the_expiry_year_in_the_year_field() {
		select_value(bh.getExpiryyr(), "2027");
	}

	@When("User enter the cvv no in the cvv field")
	public void user_enter_the_cvv_no_in_the_cvv_field() {
		send_Keys(bh.getCvv(), "435");
	}

	@When("User click the book now btn")
	public void user_click_the_book_now_btn() {
		click(bh.getBooknw());
	}

	@Then("user click on My itinerary and navigate to booked itinerary page")
	public void user_click_on_my_itinerary_and_navigate_to_booked_itinerary_page() {
		scroll(driver, bc.getMyitinery());
		js_Click(driver, bc.getMyitinery());
	}

	@When("User click on check box")
	public void user_click_on_check_box() {
		click(bc.getChkall());
	}

	@Then("User click on cancel selected btn")
	public void user_click_on_cancel_selected_btn() throws IOException {
		click(bc.getCancel_Selected());
		alert_accept(driver);
		click(bc.getLogout());
		screenshot(driver, "C:\\Users\\DELL\\eclipse-workspace\\Selenium_project\\screenshot\\Ad.png");
	}

}
