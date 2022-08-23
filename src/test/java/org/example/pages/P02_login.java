package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement loginLink(){
        WebElement loginLink = Hooks.driver.findElement(By.className("ico-login"));
        return loginLink;
    }
    public WebElement loginEmailField(){
        WebElement loginEmailField = Hooks.driver.findElement(By.id("Email"));
        return loginEmailField;
    }
    public WebElement loginPasswordField(){
        WebElement loginPasswordField = Hooks.driver.findElement(By.id("Password"));
        return loginPasswordField;
    }
    public WebElement loginButton(){
        WebElement loginButton = Hooks.driver.findElement(By.cssSelector("button.button-1.login-button"));
        return loginButton;
    }
    public WebElement myAccountLink(){
        WebElement myAccountLink = Hooks.driver.findElement(By.className("ico-account"));
        return myAccountLink;
    }
    public WebElement unsuccessfulLogin (){
        WebElement unsuccessfulLogin = Hooks.driver.findElement(By.cssSelector("div.message-error.validation-summary-errors"));
        return unsuccessfulLogin;
    }
}
