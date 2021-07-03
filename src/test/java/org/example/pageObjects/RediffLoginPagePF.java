package org.example.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Developed by Anand Singh on 03/Jul/2021, 11:40 PM.
 * Copyright (c) 2021. All rights reserved.
 */
public class RediffLoginPagePF {
    WebDriver driver;

    public RediffLoginPagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='login1']")
    WebElement usernameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(name = "proceed")
    WebElement signInButton;

    @FindBy(linkText = "rediff.com")
    WebElement homeLink;

    public WebElement email() {
        return usernameTextBox;
    }

    public WebElement password() {
        return passwordTextBox;
    }

    public WebElement signIn() {
        return signInButton;
    }

    public WebElement home() {
        return homeLink;
    }
}
