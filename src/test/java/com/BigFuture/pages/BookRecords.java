package com.BigFuture.pages;

import com.BigFuture.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookRecords extends BasePage{
    public BookRecords(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(css="[name='tbl_books_length']")
    public WebElement showDefault10Records;

    @FindBy(xpath="//select[@name='tbl_books_length']/option")
    public List<WebElement> showDefault10Records1;;//L
}
