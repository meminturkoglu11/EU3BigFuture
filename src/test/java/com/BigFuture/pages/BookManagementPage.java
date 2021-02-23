package com.BigFuture.pages;

import com.BigFuture.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookManagementPage {
    public BookManagementPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath="//thead/tr/th")
    public List<WebElement> tableColumnNamesL;
    @FindBy(id = "book_categories")
    public WebElement BookCategoriesL;
    @FindBy(css = "[type='search']")
    public WebElement BooksearchL;
}
