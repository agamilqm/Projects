 @test
  Feature: F4_PutActivities | User Update data using Body and PathParams
    Scenario: User Update Data using Body and PathParams
      Given User Update Data using Body and PathParams "/Activities/{id}"
      |title|hello|
      |id|2|
      Then Assert we updated the info using code 200