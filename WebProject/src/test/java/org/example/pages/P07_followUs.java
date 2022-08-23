package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;

public class P07_followUs {

    public void clickFB()
    {
        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]")).click();
    }
    public String getCurrentUrlFB()
    {
        return Hooks.driver.getCurrentUrl();
    }


    public void clickTwitter()
    {
        Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]")).click();
    }
    public String getCurrentUrlTwitter()
    {
        return Hooks.driver.getCurrentUrl();
    }

    public void clickRSS()
    {
        Hooks.driver.findElement(By.cssSelector(".networks>li:nth-child(3)>a")).click();
    }
    public String getCurrentUrlRss()
    {
        return Hooks.driver.getCurrentUrl();
    }

    public void clickYT()
    {
        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]")).click();
    }
    public String getCurrentUrlYT()
    {
        return Hooks.driver.getCurrentUrl();
    }


    public void closeTab()
    {
        Hooks.driver.close();
    }

}
