package com.BigFuture.step_defination;

import com.BigFuture.pages.LoginPage;
import com.BigFuture.utilities.BrowserUtils;
import com.BigFuture.utilities.ConfigurationReader;
import com.BigFuture.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Login_Step_Definition {
    @When("the user login as a {string} {string}")
    public void the_user_login_as_a(String string, String string2) {

       new LoginPage().login(string,string2);

    }

    @Then("the user on  {string}")
    public void the_user_on(String string) {
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        Assert.assertTrue(Driver.get().getTitle().contains(string));
    }

    @Then("the user should logout")
    public void the_user_should_logout() {
        BrowserUtils.waitFor(3);
      new LoginPage().logOutL();
    }


}
