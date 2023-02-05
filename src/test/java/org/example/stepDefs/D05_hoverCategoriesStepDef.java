package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {
    P03_homePage homePage = new P03_homePage();
    String subcategorytext;
    @When("user hovers on random category")
    public void user_hovers_on_random_category() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(homePage.compcatg).perform();
        Thread.sleep(4000);

    }

    @And("user selects random subcategory")
    public void userSelectsRandomSubcategory() {
        subcategorytext = homePage.dsktopsbctg.getText();
        homePage.dsktopsbctg.click();
    }

    @Then("subcategory page appears")
    public void subcategoryPageAppears() {
        String actualpagetitle = homePage.dsktoptitle.getText().toLowerCase().trim();
        System.out.println(actualpagetitle);
        System.out.println(subcategorytext);
        Assert.assertTrue(subcategorytext.toLowerCase().contains(actualpagetitle));
    }
}
