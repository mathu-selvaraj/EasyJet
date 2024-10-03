# src/test/resources/features/calculator.feature

Feature: Calculator
  Scenario: Add two numbers
    Given I have the numbers 2 and 3
    When I add them
    Then the result should be 5
