package org.example.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D03_currenciesStepDef {
    P03_homePage currency = new P03_homePage();

    @When("user select currency from the dropdown list")
    public void selectCurrency(DataTable data) {
        currency.selectCurrency(data.asList().get(0));
    }
    @Then("user check the appear of Euro symbol")
    public void checkEuroSymbol(){
        SoftAssert softAssert=new SoftAssert();
        int actual=currency.symbolfinder().size();
        int expected=4;
        Assert.assertEquals(actual,expected);

    }

}