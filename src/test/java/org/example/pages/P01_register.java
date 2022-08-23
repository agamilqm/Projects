package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {

    public WebElement registerLink(){
        WebElement registerLink = Hooks.driver.findElement(By.className("ico-register"));
        return registerLink;
    }
    public WebElement genderMaleRadioButton(){
        WebElement genderMaleRadioButton = Hooks.driver.findElement(By.id("gender-male"));
        return genderMaleRadioButton;
    }
    public WebElement genderFemaleRadioButton(){
        WebElement genderFemaleRadioButton = Hooks.driver.findElement(By.id("gender-female"));
        return genderFemaleRadioButton;
    }
    public WebElement firstNameField(){
        WebElement firstNameField = Hooks.driver.findElement(By.id("FirstName"));
        return firstNameField;
    }
    public WebElement lastNameField(){
        WebElement lastNameField = Hooks.driver.findElement(By.id("LastName"));
        return lastNameField;
    }
    public WebElement dateOfBirthDayList(){
        WebElement dateOfBirthDayList = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        return dateOfBirthDayList;
    }
    public WebElement dateOfBirthMonthList(){
        WebElement dateOfBirthMonthList = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return dateOfBirthMonthList;
    }
    public WebElement dateOfBirthYearList(){
        WebElement dateOfBirthYearList = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return dateOfBirthYearList;
    }
    public WebElement emailField(){
        WebElement emailField = Hooks.driver.findElement(By.name("Email"));
        return emailField;
    }
    public WebElement passwordField(){
        WebElement passwordField = Hooks.driver.findElement(By.id("Password"));
        return passwordField;
    }
    public WebElement confirmPasswordField(){
        WebElement confirmPasswordField = Hooks.driver.findElement(By.id("ConfirmPassword"));
        return confirmPasswordField;
    }
    public WebElement registerButton(){
        WebElement registerButton = Hooks.driver.findElement(By.id("register-button"));
        return registerButton;
    }
    public WebElement signinSuccessMassage (){
        WebElement signinSuccessMassage = Hooks.driver.findElement(By.className("result"));
        return signinSuccessMassage;
    }

}
