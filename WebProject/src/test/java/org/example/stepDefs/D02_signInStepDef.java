package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Tha;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_signInStepDef {
    P02_login login = new P02_login();


    @Given("user go to login page")
    public void goToLoginPage(){
        login.loginLink().click();
    }

    @When("^user login with valid (.*) and (.*)$")
    @When("^user login with invalid (.*) and (.*)$")
    public void loginValidData(String Email, String password) throws InterruptedException {
        login.loginEmailField().sendKeys(Email);
        login.loginPasswordField().sendKeys(password);
        Thread.sleep(3000);

    }

    @And("user press on login button")
    public void clickIoginButton(){
        login.loginButton().click();
    }
    @Then("user login to the system successfully")
    public void successfulLogin(){
        SoftAssert softAssert=new SoftAssert();

        /*softAssert.assertEquals( register.signinSuccessMassage().getText(),
                "Your registration completed");*/
        String loginUrl = Hooks.driver.getCurrentUrl();
        System.out.println("Hi miro" + loginUrl);
        softAssert.assertEquals(loginUrl,"https://demo.nopcommerce.com/");

        System.out.println("Hi loly" + login.myAccountLink());
        softAssert.assertTrue(login.myAccountLink().isDisplayed());

        softAssert.assertAll();
    }
    @Tha("user could not login to the system")
    public void unsuccessfulLogin(){
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(login.unsuccessfulLogin().getText().contains(
        "Login was unsuccessful. Please correct the errors and try again."));


        String color =login.unsuccessfulLogin().getCssValue("color");
        System.out.println(color);
        String hexa = Color.fromString(color).asHex();
        softAssert.assertEquals(hexa,"#e4434b");

        softAssert.assertAll();
    }

}
