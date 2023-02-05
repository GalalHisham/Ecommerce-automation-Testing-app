package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class P01_register {

    public P01_register() {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className = "ico-register")
    public WebElement registerlink;

    @FindBy(id = "gender-male")
    public WebElement male;
    @FindBy(id = "FirstName")
    public WebElement firstname;
    @FindBy(id = "LastName")
    public WebElement lastname;
    @FindBy(name = "DateOfBirthDay")
    public WebElement daylist;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement monthlist;
    @FindBy(name = "DateOfBirthYear")
    public WebElement yearlist;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Password")
    public WebElement password;
    @FindAll({
            @FindBy(id = "ConfirmPassword"),
            @FindBy(name = "ConfirmPassword")
    })
    public WebElement confirmpassword;
    @FindBy(how = How.ID,using = "register-button")
    public WebElement registerbutton;
    @FindBy(className = "result")
    public WebElement sucessMsg;
}
