package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class D04_searchStepDef {

    P03_homePage search = new P03_homePage();

    @Given("I search for {string}")
    public void i_search_for_search_data(String searchData) {
        search.searchStoreField().sendKeys(searchData);
        search.searchButton().click();
    }

    @Then("successful search results")
    public void searchResults() {
        SoftAssert softAssert = new SoftAssert();

        String currentSearchUrl = Hooks.driver.getCurrentUrl();
        System.out.println(currentSearchUrl);
        softAssert.assertTrue(currentSearchUrl.contains("https://demo.nopcommerce.com/search?q="), "unsuccessful Search :(");
        int numberOfButtons = search.AddToCartFinder().size();
        System.out.println("Number of search results = " + numberOfButtons);


    }
    @Then("each result contains the search word {string}")
    public void verifyEachResultContainsTheSearchWord(String searchWord) throws InterruptedException {
        int len = search.AddToCartFinder().size();
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < len; i++) {
            String verifyResult = search.searchFinder().get(i).getText().toLowerCase();
            softAssert.assertTrue(verifyResult.contains(searchWord.toLowerCase()));
            System.out.println("Item Text is "+verifyResult);
        }
        softAssert.assertAll();

        search.searchFinder().get(0).click();
    }

    @And("click on the product after search")
    public void clickOnProduct(){
        search.skuItem().click();
    }
    @Then("the result contains the sku {string}")
    public void assertSKU(String searchWord){
        SoftAssert softAssert = new SoftAssert();
        String currentSku = search.skuValue().getText().toLowerCase();
        String searchSku = searchWord.toLowerCase();

        softAssert.assertEquals(currentSku,searchSku);

        System.out.print("you searched for "+searchSku);
        System.out.print(" and the current sku is "+currentSku);

    }



  }
