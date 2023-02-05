package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();

    @Given("user go to login page")
    public void gologinpage()
    {
        login.loginlink.click();
    }


    @When("login with valid {string} and {string}")
    public void loginWithValidAnd(String email, String password) {
        login.email.sendKeys(email);
        login.password.sendKeys(password);
    }
    @And("user press on login button")
    public void user_press_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        login.lognbtn.click();
    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        // Write code here that turns the phrase above into concrete actions
        SoftAssert soft = new SoftAssert();
        //First assertion check url
        String actualurl =Hooks.driver.getCurrentUrl();
        String expectedurl ="https://demo.nopcommerce.com/";
        Assert.assertEquals(actualurl,expectedurl);
        //Second assertion check my account tab is displayed
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).isDisplayed());
        soft.assertAll();
    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String wrongmail, String pssword) {
        login.email.sendKeys(wrongmail);
        login.password.sendKeys(pssword);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();
        //First assertion check if error message contains login was unsuccessful
        String actualtxt = Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getText();
        String expectedtxt = "Login was unsuccessful";
        Assert.assertTrue(actualtxt.contains(expectedtxt),"first assertion has failed");
        //Second assertion check if text color is red #e4434b
        String actual_color = Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getCssValue("color");
        soft.assertEquals(Color.fromString(actual_color).asHex(),"#e4434b","second assertion has failed");
        soft.assertAll();
    }
}
