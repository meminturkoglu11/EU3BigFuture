package com.BigFuture.step_defination;

import com.BigFuture.pages.BookManagementPage;
import com.BigFuture.pages.LoginPage;
import com.BigFuture.utilities.BrowserUtils;
import com.BigFuture.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class table_column_Step_Definations {
    @Given("the user login as a new {string}")
    public void the_user_login_as_a_new(String string) {
        new LoginPage().login(ConfigurationReader.get("studentUsername"),ConfigurationReader.get("studentPassword"));
    }
    @Then("table should have following column names")
    public void table_should_have_following_column_names(List<String> expectedColumns) {
        BrowserUtils.waitFor(4);
        List<WebElement> tableColumnNamesL = new BookManagementPage().tableColumnNamesL;
        BrowserUtils.waitFor(4);
        List<String> elementsText = BrowserUtils.getElementsText(tableColumnNamesL);
        BrowserUtils.waitFor(3);
        System.out.println("elementsText = " + elementsText);
        System.out.println("expectedColumns = " + expectedColumns);
        Assert.assertEquals(expectedColumns,elementsText);
        for (int i = 0; i < expectedColumns.size(); i++) {
             Assert.assertEquals(expectedColumns.get(i),elementsText.get(i));

        }
    }
    @Then("the user should be able to search books with different categories")
    public void the_user_should_be_able_to_search_books_with_different_categories(List<String> BookCategoriesExpected) {
        new Select (new BookManagementPage().BookCategoriesL).selectByVisibleText("Classic");
        BrowserUtils.waitFor(7);
        System.out.println("new BookManagementPage().BookCategoriesL.getText() = " + new BookManagementPage().BookCategoriesL.getText());
        Select select=new Select(new BookManagementPage().BookCategoriesL);
        List<WebElement> options = select.getOptions();
        List<String> elementsText = BrowserUtils.getElementsText(options);
        System.out.println("BookCategoriesExpected = " + BookCategoriesExpected);
        System.out.println("elementsText = " + elementsText);
        Assert.assertEquals(BookCategoriesExpected,elementsText);
        for (WebElement categoryOption : options) {
            categoryOption.click();
            BrowserUtils.waitFor(3);
            new BookManagementPage().BooksearchL.sendKeys("Ahmet");
            BrowserUtils.waitFor(2);
        }
    }

}
