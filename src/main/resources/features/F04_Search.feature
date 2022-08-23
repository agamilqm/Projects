@smoke
  #Test Case 4
Feature: F04_Search | users could search for products

Scenario Outline: user could search using product name
Given I search for <searchData>
Then successful search results
And each result contains the search word <searchData>

Examples:
|searchData|
|"book"    |
|"laptop"  |
|"nike"    |

Scenario Outline: user could search for product using sku
Given I search for <searchSku>
And click on the product after search
Then the result contains the sku <searchSku>
Examples:
|searchSku|
|"SCI_FAITH"|
|"APPLE_CAM"|
|"SF_PRO_11"|
