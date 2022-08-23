package org.example.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import org.testng.util.Strings;

public class D01_registerStepDef {

    P01_register register = new P01_register();

    @Given("user goes to register page")
    public void goToRegisterPage(){
        register.registerLink().click();
    }

    @When("user selects gender type male or female")
    public void selectGender() throws InterruptedException {

        register.genderFemaleRadioButton().click();
        Thread.sleep(3000);
        register.genderMaleRadioButton().click();

    }

    @And("user enters first name and last name")

    public void setFnameLname(DataTable data){

        register.firstNameField().sendKeys(data.asList().get(0));
        register.lastNameField().sendKeys(data.asList().get(1));
    }

    @And("user enters the date of birth")
    public void enterBirthday() {
        Select select = new Select(register.dateOfBirthDayList());
        select.selectByIndex(22);
        select = new Select(register.dateOfBirthMonthList());
        select.selectByValue("9");
        select = new Select(register.dateOfBirthYearList());
        select.selectByVisibleText("1994");
    }
    @And("user enters the email")
    public void enterEmail()
    {
        register.emailField().sendKeys("test@example.com");
    }

    @And("user enters the password")
    public void enterPassword()
    {
        register.passwordField().sendKeys("P@ssw0rd");
    }
    @And("user enters the confirm password")
    public void enterConfirmPassword(){
        register.confirmPasswordField().sendKeys("P@ssw0rd");

    }

    @And("user clicks on register button")
    public void clickRegisterButton(){
        register.registerButton().click();
    }

    @Then("success message is displayed")
    public void succesMessage(){
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(register.signinSuccessMassage().getText().contains(
                "Your registration completed"),"Miro Error user did not register");

        String backGroundColor =register.signinSuccessMassage().getCssValue("background-color");
        System.out.println(backGroundColor);
        String hexa = Color.fromString(backGroundColor).asHex();
        System.out.println(hexa);
        softAssert.assertEquals(hexa,"#000000");

        softAssert.assertAll();
    }



}
