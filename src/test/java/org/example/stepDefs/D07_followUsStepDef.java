package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P07_followUs;
import org.example.stepDefs.Hooks;
import org.testng.Assert;
import java.util.ArrayList;

public class D07_followUsStepDef {
    P07_followUs followUsPage = new P07_followUs();
    /*------------------------ Scenario 1 ------------------------ */

    @Given("user opens facebook link")
    public void userOpensFacebookLink()
    {
        followUsPage.clickFB();
    }

    @Then("{string} FB is opened in new tab")
    public void fbIsOpenedInNewTab(String url) throws InterruptedException
    {
        Thread.sleep(2000);

        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        Assert.assertEquals(followUsPage.getCurrentUrlFB(),url);
        followUsPage.closeTab();
      }

    /*------------------------ Scenario 2 ------------------------ */
    @Given("user opens twitter link")
    public void userOpensTwitterLink()
    {
        followUsPage.clickTwitter();
    }

    @Then("{string} Tw is opened in new tab")
    public void twIsOpenedInNewTab(String url) throws InterruptedException
    {
        Thread.sleep(2000);

        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        Assert.assertEquals(followUsPage.getCurrentUrlTwitter(),url);
        followUsPage.closeTab();

    }
    /*------------------------ Scenario 3------------------------ */

    @Given("user opens rss link")
    public void userOpensRssLink()
    {
        followUsPage.clickRSS();
    }

    @Then("{string} Rss is opened in new tab")
    public void rssIsOpenedInNewTab(String url) throws InterruptedException
    {
        Thread.sleep(2000);

        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        Assert.assertEquals(followUsPage.getCurrentUrlRss(),url);
        followUsPage.closeTab();
    }
    /*------------------------ Scenario 4 ------------------------ */

    @Given("user opens youtube link")
    public void userOpensYoutubeLink()
    {
        followUsPage.clickYT();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String url) throws InterruptedException
    {
        Thread.sleep(2000);

        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        Assert.assertEquals(followUsPage.getCurrentUrlYT(),url);
        followUsPage.closeTab();

    }
}
