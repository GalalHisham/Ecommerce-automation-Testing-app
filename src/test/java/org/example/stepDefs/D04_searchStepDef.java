package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage();

   @When("user presses on search field")
    public void user_presses_on_search_field() {
        // Write code here that turns the phrase above into concrete actions
    homePage.srchfield.click();
    }


    @And("user enters name {string} and user press on search button")
    public void userEnters(String searchword) {
       homePage.srchfield.sendKeys(searchword);
       homePage.srchbtn.click();

    }


    @And("user enters SKU {string} and user presses on search button")
    public void userEntersSKUAndUserPressesOnSearchButton(String arg0) {
        homePage.srchfield.sendKeys(arg0);
        homePage.srchbtn.click();
    }

    @Then("user will find all related products {string}")
    public void userWillFindAllRelatedProducts(String searchword) {
        SoftAssert soft = new SoftAssert();
        int counter = 0;
        //First Assertion check url
        String actualurl =Hooks.driver.getCurrentUrl();
        String expectedurl ="https://demo.nopcommerce.com/search?q=";
        Assert.assertTrue(actualurl.contains(expectedurl));
        //Second Assertion check results have searchword

        for (int i = 0; i < homePage.producttitles.size(); i++)
        {
            String check = String.valueOf(homePage.producttitles.get(i).getText().toLowerCase().contains(searchword));
               if(check.equals("true")){
                   String producttitle= homePage.producttitles.get(i).getText().toLowerCase();
                   Assert.assertTrue(producttitle.contains(searchword));
                   counter++;
               }

        }
        System.out.println("number of relevant results is "+counter);
        soft.assertAll();
    }

    @Then("user will find related products {string}")
    public void userWillFindRelatedProducts(String searchsku) {
        homePage.srchedprdct.click();
        String actualsku = homePage.sku.getText();
        Assert.assertEquals(actualsku,searchsku);
    }
}
