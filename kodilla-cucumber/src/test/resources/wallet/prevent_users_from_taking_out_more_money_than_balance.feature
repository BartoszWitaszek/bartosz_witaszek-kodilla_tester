Feature: Prevent users from taking out more money than their wallet contains
  Scenario: User tries to take out more money than their balance
    Given in my wallet is $100
    When I withdraw $200
    Then nothing should be dispensed
    And I should be told that I don't have enough money in my wallet