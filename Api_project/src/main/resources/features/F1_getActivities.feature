@smoke @test
  Feature: F01_getActivitiesData
    Scenario: User Get Activities
      Given Get All Activities "/Activities"
      Then  assert we got it using CodeStatus 200

    Scenario: User Get Certain Activity
      Given Get Activities with id "/Activities/{id}"
      Then  assert we got title "Activity 1"