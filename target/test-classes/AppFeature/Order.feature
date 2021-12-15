Feature: Amazon Order Page
In order to check my order details
As a registered user

Background:
  Given a registered user exists
  Given User is on amazon login page
  And user enter username
  And user enter password
  And user clicks on login button 
  Then User navigate to orders page

Scenario: Check Previous Order Details
 When User Clicks on Order Link
 Then User Check Order Detail Page
 
Scenario: Check Open Order Details
 When User Clicks on Open Order Link
 Then User Check the Open Order Detail
 
Scenario: Check Cancelled Order Details
 When User Clicks on Cancelled Order Link
 Then User Check the Cancelled Order Detail 