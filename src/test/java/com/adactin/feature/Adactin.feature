Feature: Validate The Functionality Of The Hotel Booking Application In Adactin Hotel App
@AD1
Scenario: Login Page
Given User launch the application
When User enter the username in the username field
And User enter the password in the password field
Then User click the login btn and navigate to search hotel page

@AD2
Scenario: Search Hotel
When User select the location in the location field
And User select the hotel in the hotel field
And User select the room type in the room type field
And User select the no.of rooms in the rooms field
And User clear and select the chk in date in the chk in date field
And User clear and select the chk out date in chk out date field
And User select the adults rooms in the adults room field
And User select the child room in the child room field
Then User click the search btn and navigate to select hotel page

@AD3
Scenario: select Hotel
When User click the radio button in the select field
Then User click the continue btn and navigate to book hotel page

@AD4
Scenario: book Hotel
When User enter the first name in the fn field
And User enter the last name in the ln field
And User enter the billing add  in the address field
And User enter the credit no in the card no field
And User enter the credit card type  in the cc type field
And User enter the expiry mnth in the mnth field
And User enter the expiry year in the year field
And User enter the cvv no in the cvv field
And User click the book now btn 
Then user click on My itinerary and navigate to booked itinerary page

@AD5
Scenario: booked itinerary
When User click on check box 
Then User click on cancel selected btn