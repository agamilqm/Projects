package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P08_wishList;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_wishListStepDef {

    P08_wishList wishListPage = new P08_wishList();

    @Given("user at homepage and adding the item to the wishlist")
    public void step1_S1()
    {
        wishListPage.clickAddToFavBtn();
    }
    @Then("assert the item is added")
    public void step2_S1()
    {
        SoftAssert assertion =new SoftAssert();

        assertion.assertEquals(wishListPage.getMsgBarTxt(),"The product has been added to your wishlist");
        assertion.assertEquals(wishListPage.getMsgBarColor(),"#4bb07a");
        assertion.assertAll();
    }

    @Given("user at the wishlist page")
    public void Step1_S2()
    {
        wishListPage.clickAddToFavBtn();
        wishListPage.clickAddToFavBtn();
        wishListPage.clickWishListPage();
    }
    @Then("check the Qty value and verify it is bigger than 0")
    public void Step2_S2()
    {
        Assert.assertNotEquals("0" ,wishListPage.getQtyValue());
    }




}