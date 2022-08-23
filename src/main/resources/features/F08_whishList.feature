@smoke
Feature: F08_WhishList | adding an item to the wishlist
    #Test case 1
  Scenario: adding an item to the wishlist
    Given user at homepage and adding the item to the wishlist
    Then assert the item is added

    #Test case 2
  Scenario: checking the Qty value of items in the wishlist page
    Given user at the wishlist page
    Then check the Qty value and verify it is bigger than 0