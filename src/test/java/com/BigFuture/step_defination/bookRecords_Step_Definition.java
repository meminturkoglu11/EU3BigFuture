package com.BigFuture.step_defination;

import com.BigFuture.pages.BasePage;
import com.BigFuture.pages.BookManagementPage;
import com.BigFuture.pages.BookRecords;
import com.BigFuture.pages.LoginPage;
import com.BigFuture.utilities.BrowserUtils;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class bookRecords_Step_Definition {
    @When("the user should click the bookButton")
    public void the_user_should_click_the_bookButton() {
        BrowserUtils.waitFor(3);
        List<WebElement> librarianModules = new LoginPage().LibrarianModules;
        librarianModules.get(2).click();
        BrowserUtils.waitFor(3);
    }

    @When("the user should see default ten records")
    public void the_user_should_see_default_ten_records() {
        Select select=new Select(new BookRecords().showDefault10Records);
       // System.out.println(select.getFirstSelectedOption().getText());
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"10");
    }

    @Then("the page show records following options")
    public void the_page_show_records_following_options(List<String>expectedOption){
        List<WebElement> showDefault10Records1 = new BookRecords().showDefault10Records1;
        for (int i = 0; i < expectedOption.size(); i++) {

            System.out.println("showDefault10Records1.getText() = " + showDefault10Records1.get(i).getText());
            Assert.assertEquals(showDefault10Records1.get(i).getText(),expectedOption.get(i));
        }


        }



    }



