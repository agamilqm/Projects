package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {
    public void selectCurrency(String curr){
        WebElement cur= Hooks.driver.findElement(By.id("customerCurrency"));
        Select select =new Select(cur);
        select.selectByVisibleText(curr);
    }
    public List<WebElement> symbolfinder(){
        List <WebElement> euroSymbol=Hooks.driver.findElements(By.xpath("//div[@class='product-grid home-page-product-grid']//span[contains(text(),'€')]"));
        return euroSymbol;
    }
    public WebElement loginBtn() {
        WebElement logBtn = Hooks.driver.findElement(By.className("ico-login"));
        return logBtn;
    }
    public WebElement searchBox(){
        WebElement searchBox=Hooks.driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        return searchBox;
    }
    public WebElement searchBtn(){
        WebElement searchBtn=Hooks.driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
        return searchBtn;
    }

    public WebElement SKU(){
        WebElement sku=Hooks.driver.findElement(By.xpath("//div[@class='sku']//span[@class='value']"));
        return sku;
    }

    public WebElement addToCartBtn(){
        WebElement addToCartBtn=Hooks.driver.findElement(By.xpath("//div[contains(@class,'overview')]//div[contains(@class,'add-to-cart')]//button[contains(text(),'Add to cart')]"));
        return addToCartBtn;
    }
    public WebElement checkAvailability(){
        WebElement checkAvailability=Hooks.driver.findElement(By.xpath("//div[contains(@class,'overview')]//*[contains(text(),'Add to cart')]"));
        return checkAvailability;
    }
    public WebElement successAddedAlert(){
        WebElement alertMsg=Hooks.driver.findElement(By.xpath("//*[text()='The product has been added to your ']"));
        return alertMsg;
    }
    public WebElement sliders(String num)
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+num+")"));
    }
    public WebElement searchStoreField(){
        WebElement searchStoreFiled = Hooks.driver.findElement(By.id("small-searchterms"));
        return searchStoreFiled;
    }

    public WebElement searchButton(){
        WebElement searchButton = Hooks.driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        return searchButton;
    }

    public List<WebElement> AddToCartFinder(){
        List <WebElement> cartButton =Hooks.driver.findElements(By.xpath("//button[contains(@class,'product-box-add-to-" +
                "cart-button')]"));
        return cartButton;
    }
    public List<WebElement> searchFinder() {
//        WebElement searchFrame=Hooks.driver.findElement(By.xpath("//*[@class='search-results']"));
//
//        List<WebElement>searchResult=searchFrame.findElements(By.xpath("//div[contains(@class,'details')]//a"));
        List<WebElement>  searchResult=Hooks.driver.findElements(By.xpath("//div[contains(@class,'search-results')]//div[contains(@class,'details')]//a"));
        return searchResult;
    }

    public WebElement skuItem(){
        WebElement item = Hooks.driver.findElement(By.xpath("//div[contains(@class,'search-results')]//img"));
        return item;
    }
    public WebElement skuValue(){
        WebElement skuValue = Hooks.driver.findElement(By.xpath("//div[contains(@class,'sku')]" +
                "//span[contains(@class,'value')]"));
        return skuValue;
    }

    public List<WebElement> mainHeader(){
        List<WebElement> mainHeader = Hooks.driver.findElements(By.xpath("//ul[contains(@class,'top-menu')and " +
                "not(contains(@class,'notmobile'))]//li//a"));
        return mainHeader;
    }

    public void  selectComputers(String subCat){
        WebElement com = Hooks.driver.findElement(By.xpath("//a[contains(text(),'Computers ')]"));
        Select select =new Select(com);
        select.selectByVisibleText(subCat);
    }



}

