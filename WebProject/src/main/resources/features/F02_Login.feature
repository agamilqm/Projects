@smoke
  #Test Case 2
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario Outline: : user could login with valid email and password
    Given user go to login page
    When user login with valid <Email> and <password>
    And user press on login button
    Then user login to the system successfully

    Examples:
    |Email|password|
    |test@example.com|P@ssw0rd|

  Scenario Outline: user could login with invalid email and password
    Given user go to login page
    When user login with invalid <Email> and <password>
    And user press on login button
    Then user could not login to the system

    Examples:
      |Email|password|
      |higoodbye@example.com|password|


