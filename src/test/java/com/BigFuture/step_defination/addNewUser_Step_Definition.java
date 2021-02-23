package com.BigFuture.step_defination;

import com.BigFuture.pages.AddUserPage;
import com.BigFuture.pages.LoginPage;
import com.BigFuture.utilities.BrowserUtils;
import com.BigFuture.utilities.ConfigurationReader;
import com.BigFuture.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class addNewUser_Step_Definition {
    @Given("the user login as a {string}")
    public void the_user_login_as_a(String string) {

        new LoginPage().login(ConfigurationReader.get("librarianUsername"),ConfigurationReader.get("librarianPassword"));

    }

    @When("the user add new information of the new user")
    public void the_user_add_new_information_of_the_new_user() {
        BrowserUtils.waitFor(3);
        new LoginPage().LibrarianModules.get(1).click();
        BrowserUtils.waitFor(3);
        new AddUserPage().adduser.click();
        BrowserUtils.waitFor(4);
new AddUserPage().sendInfo("Mehmet Turkoglu","Mehmet","memin@gmail.com","Students","ACTIVE","2020-11-17","2020-12-15","London UK");
    }

    @When("the user able to save changes")
    public void the_user_able_to_save_changes() {
        BrowserUtils.waitFor(2);
     new AddUserPage().saveClose();
    }

    @Then("the user able to edit info")
    public void the_user_able_to_edit_info() {
      new AddUserPage().editNewUsers();
    }




}
