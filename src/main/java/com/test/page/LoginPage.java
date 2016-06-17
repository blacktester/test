package com.test.page;

import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;

import java.net.URL;


public class LoginPage {

    @FindBy(how = How.ID, using = "user")
    private SelenideElement login;

    @FindBy(how = How.ID_OR_NAME, using = "password")
    private SelenideElement password;




    public void inputLoginAndPassword(){
        login.click();
        password.click();
    }

}