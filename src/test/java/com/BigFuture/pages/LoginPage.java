package com.BigFuture.pages;

import com.BigFuture.utilities.ConfigurationReader;
import com.BigFuture.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="inputEmail")
    public WebElement email;



    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy(css = "[type='submit']")
    public WebElement signin;


    public void login(String userNameStr, String passwordStr) {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        email.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        signin.click();
        // verification that we logged
    }
    //BREAK UNTIL 12:10

}