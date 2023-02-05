package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P03_homePage homePage = new P03_homePage();
    @When("user clicks on wishlist button on this product \\(HTC One M8 Android L5 Lollipop)")
    public void user_clicks_on_wishlist_button_on_this_product_htc_one_m8_android_l5_lollipop() {

        homePage.htcwishlistbtn.click();
    }


    @Then("this product is added successfully to wishlist")
    public void thisProductIsAddedSuccessfullyToWishlist() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(homePage.wishlstsucssmesg.isDisplayed());
        String actualcolor = homePage.wishlstsucssmesg.getCssValue("background-color");
        String expexctedcolor ="#4bb07a";
        Assert.assertEquals(Color.fromString(actualcolor).asHex(),expexctedcolor);
        soft.assertAll();
    }

    @And("clicks on wishlist link")
    public void clicksOnWishlistLink() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(homePage.wishlstsucssmesg));
        homePage.wishlistlink.click();
    }

    @Then("verify the product is added successfully and product quantity is more than zero")
    public void verifyTheProductIsAddedSuccessfullyAndProductQuantityIsMoreThanZero() {
        int productquantity = Integer.parseInt(homePage.prdctQTY.getAttribute("value"));
        Assert.assertTrue(productquantity > 0);
    }
}
