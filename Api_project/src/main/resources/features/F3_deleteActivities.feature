@smoke @test

Feature:F3_deleteActivities |User Delete a certain activity using PathParams
  Scenario: User Delete Activity data using PathParams
    Given Delete Activity using PathParams "/Activities/{id}"
    |id|
    |1 |
    Then Assert we deleted with code 200