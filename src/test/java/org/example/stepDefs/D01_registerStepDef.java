package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef {

        P01_register register = new P01_register();
    @Given("user go to register page")
        public void goRegisterPage()
        {
            register.registerlink.click();
        }

    @When("user select gender type")
    public void userSelectGenderType() {
            register.male.click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstname, String lastname) {
            register.firstname.sendKeys(firstname);
            register.lastname.sendKeys(lastname);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        //select day
        Select selectday = new Select(register.daylist);
        selectday.selectByValue("6");
        //select month
        Select selectmonth = new Select(register.monthlist);
        selectmonth.selectByVisibleText("March");
//        selectmonth.selectByValue("3");
        //select year
        Select selectyear = new Select(register.yearlist);
        selectyear.selectByIndex(9);
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {
        Faker fake = new Faker();
        String emailadress =fake.internet().safeEmailAddress();
        register.email.sendKeys(emailadress);
        }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String Password, String Confirmpassword) {
            register.password.sendKeys(Password);
            register.confirmpassword.sendKeys(Confirmpassword);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
            register.registerbutton.click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();
        //1-get text and verify it contains your registeration completed
        soft.assertTrue(register.sucessMsg.getText().contains("Your registration completed"));

        //2-get cssvalue and verify color is green #4cb17c hex
        String actual_color = register.sucessMsg.getCssValue("color");
        soft.assertEquals(Color.fromString(actual_color).asHex(),"#4cb17c");

        soft.assertAll();
    }
}

