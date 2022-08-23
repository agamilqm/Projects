package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_categories {



    public WebElement hoverCategories2(){
        //WebElement hoverCategories = Hooks.driver.findElement(By.linkText("Computers "));
        WebElement hoverCategories =Hooks.driver.findElement(By.xpath("//a[contains(text(),'Computers ')]"));
        return hoverCategories;
    }

    public WebElement desktopSelect(){
        WebElement desktopLink =Hooks.driver.findElement(By.xpath(
                "//ul[contains(@class,'top-menu')]//a[contains(@href,'/desktops')]"));
        return desktopLink;
    }
}
