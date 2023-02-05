package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();
    @When("user chooses from currency droplist and chooses euro")
    public void userchoosesfromcurrdroplistandchosseseuro() throws InterruptedException {
        Select droplist = new Select(homePage.currencydroplist);
        Thread.sleep(2000);
        droplist.selectByVisibleText("Euro");

    }


    @Then("Verify Euro Symbol \\(€) is shown on the four products displayed in Home page")
    public void verifyEuroSymbol€IsShownOnTheFourProductsDisplayedInHomePage() {
        for(int i = 0; i < homePage.productprices.size(); i++)
        {
            String actualpricecurrency = homePage.productprices.get(i).getText();
            Assert.assertTrue(actualpricecurrency.contains("€"));
        }


    }
}
