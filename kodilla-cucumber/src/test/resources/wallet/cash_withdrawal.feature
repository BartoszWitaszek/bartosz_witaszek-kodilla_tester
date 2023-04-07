Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario Outline: Unsuccessful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $<amount>
    Then there should be error message "This amount is incorrect!"
    Examples:
      | amount |
      | 201    |
      | 0      |
      | -100   |