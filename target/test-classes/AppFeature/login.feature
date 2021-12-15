Feature: Login Feature

  Scenario Outline: Login Fail - Possible Combination
    Given User is on Apllication Login Page
    When User click on Sign in button
    Then User is displayed login screen
    When user enters "<Username>" in Username field
    And user enters "<Password>" in Password field
    And User clicks Sign in Button 
    Then User Gets Login Failed Message
    Examples: 
      | Username  | Password |
      | rahul |     12334  |
      | rahulss  |     1234443  |
      | ravi   | 1222323    | 

