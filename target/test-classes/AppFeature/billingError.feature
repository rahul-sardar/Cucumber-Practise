Feature: Calculate Billing Amount

  Scenario Outline: Billing Amount
    Given User is on Billing Page
    When user enters billing amount <billingamount>
    When user enters tax amount <taxamount>
    And user clicks on calculate Button
    Then it gives the final amount <finalamount>

    Examples: 
      | billingamount  | taxamount | finalamount  |
      | 1000 |     10  | 1010      |
      | 500  |     20  | 520       |
      | 100   | 5.5    | 105.5     |
