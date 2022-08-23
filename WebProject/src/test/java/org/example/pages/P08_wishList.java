package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P08_wishList {


    public void clickAddToFavBtn()
    {
        WebElement favBtn =  Hooks.driver.findElement(By.xpath("//div[text()='HTC - One (M8) 4G LTE Cell Phone with 32GB Memory - Gunmetal (Sprint)'] /following-sibling::div//button[contains(@class,'button-2 add-to-wishlist-button')]"));
        favBtn.click();

    }
    public String  getMsgBarTxt()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.xpath("//div[contains(@class,'bar-notification success')]"))));

        WebElement msgBar = Hooks.driver.findElement(By.xpath("//div[contains(@class,'bar-notification success')]"));
        return msgBar.getText();
    }
    public String getMsgBarColor()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(By.xpath("//div[contains(@class,'bar-notification success')]"))));

        WebElement msgBar = Hooks.driver.findElement(By.xpath("//div[contains(@class,'bar-notification success')]"));
        return Color.fromString(msgBar.getCssValue("background-color")).asHex();
    }

    public void clickWishListPage()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(Hooks.driver.findElement(By.xpath("//div[contains(@class,'bar-notification success')]"))));

        Hooks.driver.findElement(By.className("ico-wishlist")).click();
    }

    public String getQtyValue()
    {
        return Hooks.driver.findElement(By.cssSelector(".quantity>input")).getCssValue("value"); ////input[@name='itemquantity11216']

    }


}
