package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user click on first home slider iphone")
    public void user_click_on_first_home_slider_iphone() {
        homePage.homeslider1.click();
    }


    @Then("user is redirected to iphone details page")
    public void userIsRedirectedToIphoneDetailsPage() throws InterruptedException {
        Thread.sleep(2000);
        String actualurl = Hooks.driver.getCurrentUrl();
        String expectedurl ="https://demo.nopcommerce.com/iphone-14";
        Assert.assertEquals(actualurl,expectedurl);
    }

    @When("user click on second home slider galaxy")
    public void userClickOnSecondHomeSliderGalaxy() throws InterruptedException {
        Thread.sleep(4000);
        homePage.homeslider2.click();
    }

    @Then("user is redirected to galaxy details page")
    public void userIsRedirectedToGalaxyDetailsPage() throws InterruptedException {
        Thread.sleep(2000);
        String actualurl = Hooks.driver.getCurrentUrl();
        String expectedurl ="https://demo.nopcommerce.com/galaxy-s22";
        Assert.assertEquals(actualurl,expectedurl);
    }
}
