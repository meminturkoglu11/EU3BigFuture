package com.BigFuture.pages;

import com.BigFuture.utilities.BrowserUtils;
import com.BigFuture.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddUserPage extends BasePage{
    public AddUserPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css="[name='full_name']")
    public WebElement fullnameL;
    @FindBy(css="[name='password']")
    public WebElement passwordUserL;
    @FindBy(xpath="//input[@name='email']")
    public WebElement emailUserL;
    @FindBy(xpath="//select[@name='user_group_id']")
    public WebElement userGroupL;
    @FindBy(xpath="(//select[@name='status'])[1]")
    public WebElement statusL;
    @FindBy(xpath="//input[@name='start_date']")
    public WebElement startDateL;
    @FindBy(xpath="//input[@name='end_date']")
    public WebElement endDateL;
    @FindBy(xpath="//textarea[@name='address']")
    public WebElement addressL;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement saveChangeL;
    @FindBy(xpath="//div[@class='modal-footer']/button[2]")
    public WebElement saveChange2L;
    @FindBy(xpath="//button[@type='cancel']")
    public WebElement closeL;
    @FindBy(xpath="//div[@class='modal-footer']/button[1]")
    public WebElement close2L;
    @FindBy(xpath="//tbody/tr/td/a")
    public List<WebElement> editUserL;


    public void editUserInfo(){
      Driver.get().findElement(By.xpath("//tbody/tr[1]")).click();
    }

    public  void editNewUsers(){
        for (int i = 1; i <= editUserL.size(); i++) {
            BrowserUtils.waitFor(3);
            Driver.get().findElement(By.xpath("//tbody/tr["+i+"]/td/a")).click();
            BrowserUtils.waitFor(3);
            closeL.click();

        }
    }

    public void sendInfo(String fullname,String password,String email,String userGroup,String status,String startDate,String endDate,String address){
       fullnameL.sendKeys(fullname);
       passwordUserL.sendKeys(password);
       emailUserL.sendKeys(email);
       new Select(userGroupL).selectByVisibleText(userGroup);
       new Select(statusL).selectByVisibleText(status);
       startDateL.clear();
        BrowserUtils.waitFor(2);
       startDateL.sendKeys(startDate);
       endDateL.clear();
       BrowserUtils.waitFor(2);
       endDateL.sendKeys(endDate);
       addressL.sendKeys(address);

    }
    public void saveClose(){
        BrowserUtils.waitFor(3);
        saveChangeL.click();
        closeL.click();
    }



}
