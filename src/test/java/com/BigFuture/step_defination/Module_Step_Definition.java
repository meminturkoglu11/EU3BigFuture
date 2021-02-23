package com.BigFuture.step_defination;

import com.BigFuture.pages.LoginPage;
import com.BigFuture.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;


import java.util.List;

public class Module_Step_Definition {
    @Then("the modules contains {string}")
    public void the_modules_contains(String a) {
    BrowserUtils.waitFor(4);
        List<String> ModulesText = BrowserUtils.getElementsText(new LoginPage().LibrarianModules);

        System.out.println("ModulesText = " + ModulesText);
        System.out.println("a = " + a);
        String[] aMembers = a.split("-");
        for (int i = 0; i < ModulesText.size(); i++) {
            Assert.assertEquals(aMembers[i].trim(),ModulesText.get(i));
            System.out.println("aMembers[i].trim() = " + aMembers[i].trim());
            System.out.println("ModulesText.get(i) = " + ModulesText.get(i));

        }
    }

}
