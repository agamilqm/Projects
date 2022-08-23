package org.example.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P05_categories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Random;

public class D05_hoverCategoriesStepDef {

    P05_categories hover = new P05_categories();
    P03_homePage home = new P03_homePage();

    @Given("user hover category and select subcategory")
    public void hoverCategories() throws InterruptedException {


        Actions action = new Actions(Hooks.driver);
        action.moveToElement(hover.hoverCategories2()).perform();
        Thread.sleep(2000);

        //get the text of this sub-category
        Assert.assertEquals(hover.desktopSelect().getText().toLowerCase().trim(),"desktops");
        String text = hover.desktopSelect().getText();
        System.out.println("Hi miro"+ text);
        hover.desktopSelect().click();

    }

    @When("user select subcategory")
    public void selectComputers(DataTable sub) {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(hover.hoverCategories2()).perform();
        hover.desktopSelect().click();    }

    @Then("assert sub category")
    public void checkText() throws InterruptedException {

        Assert.assertEquals(Hooks.driver.findElement(By.xpath("//div[@class='page-title']")).getText(),
                "Desktops");


    }
}