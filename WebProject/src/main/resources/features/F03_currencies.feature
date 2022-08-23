@smoke
Feature: F03_currencies | users could check the appear of currency symbol
  Scenario: user could select select euro currency and check the appear of its symbol
    When user select currency from the dropdown list
      |Euro|
    Then user check the appear of Euro symbol