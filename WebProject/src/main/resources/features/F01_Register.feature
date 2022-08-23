@smoke
  #Test Case 1
  Feature: F01_Register | users could register with new accounts
Scenario: guest user could register with valid data successfully
      Given user goes to register page
      When user selects gender type male or female
      And user enters first name and last name
            |Amira|
            |Badr|
      And user enters the date of birth
      And user enters the email
      And user enters the password
      And user enters the confirm password
      And user clicks on register button
      Then success message is displayed







