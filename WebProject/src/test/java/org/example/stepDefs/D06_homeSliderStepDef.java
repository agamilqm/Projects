package org.example.stepDefs;

import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSliderStepDef {
    P03_homePage home = new P03_homePage();


    @When("click on slider")
    public void clickFirstSlider()
    {



        home.sliders("1").click();
        Assert.assertFalse(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"));
        System.out.println("The First Scenario the url is "+Hooks.driver.getCurrentUrl());
    }

    @When("click on second slider")
    public void clickOnSecondSlider()
    {
        home.sliders("2").click();
        Assert.assertFalse(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"));
        System.out.println("The Second Scenario the url is "+Hooks.driver.getCurrentUrl());
    }
}
