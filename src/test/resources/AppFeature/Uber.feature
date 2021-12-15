@All
Feature: Uber Booking Feature



@Smoke
Scenario: Booking Cab Sedan
Given User want to select a car type "sedan" from uber application
When User Select car "sedan" and pick up point "Bangalore" and drop location "pune"
Then Driver Start the Journey
And Driver Ends the Journey
Then User Pays 1000 USD

@Smoke @Regression 
Scenario: Booking Cab SUV
Given User want to select a car type "SUV" from uber application
When User Select car "SUV" and pick up point "Bangalore" and drop location "Mumbai"
Then Driver Start the Journey
And Driver Ends the Journey
Then User Pays 1000 USD


@Prod
Scenario: Booking Cab for Mini
Given User want to select a car type "Mini" from uber application
When User Select car "Mini" and pick up point "Pune" and drop location "Mumbai"
Then Driver Start the Journey
And Driver Ends the Journey
Then User Pays 500 USD