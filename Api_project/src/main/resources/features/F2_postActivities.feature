@smoke @test
  Feature: F02_postActivities | user post data to activities
    Scenario: User Post Activity data using body
      Given User Post data using body "/Activities"
      |title|
      |2|
      Then Assert we got code 200

    Scenario: User Post data using PathParams and Body
      Given User Post data using PathParams "/{Activities}" and Body
      |title|
      |Testing 1|
      Then Assert we got code S2 200
      And Assert title is "Testing 1"