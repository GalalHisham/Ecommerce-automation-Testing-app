package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage homePage = new P03_homePage();
    ArrayList<String> tabs;
    @When("user clicks on facebook icon")
    public void user_clicks_on_facebook_icon() {
        homePage.facebookicon.click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
         tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user navigates to facebook page {string}")
    public void userNavigatesToFacebookPage(String expectedurl) throws InterruptedException {
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(1));
        String actualurl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualurl,expectedurl);
    }

    @When("user clicks on twitter icon")
    public void userClicksOnTwitterIcon() {
        homePage.twittericon.click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user navigates to twitter page {string}")
    public void userNavigatesToTwitterPage(String expctdurl) throws InterruptedException {
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(1));
        String actualurl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualurl,expctdurl);

    }

    @When("user clicks on rss icon")
    public void userClicksOnRssIcon() {
        homePage.rssicon.click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user navigates to rss page {string}")
    public void userNavigatesToRssPage(String expectedurl) throws InterruptedException {
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(1));
        String actualurl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualurl,expectedurl);
    }

    @When("user clicks on youtube icon")
    public void userClicksOnYoutubeIcon() {
        homePage.youtubeicon.click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user navigates to youtube page {string}")
    public void userNavigatesToYoutubePage(String expctdurl) throws InterruptedException {
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(1));
        String actualurl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualurl,expctdurl);
    }
}
