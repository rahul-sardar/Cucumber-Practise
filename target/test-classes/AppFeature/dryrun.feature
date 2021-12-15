Feature: Calculate Billing Amount in rupees

Scenario: Billing Amount checking
Given User is on Billing Pages
When user enters billing amount in rupees 
When user enters tax amount  in rupees
And user clicks on calculate button to get output
Then it gives the final amount in rupees
