package org.example.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Developed by Anand Singh on 03/Jul/2021, 11:40 PM.
 * Copyright (c) 2021. All rights reserved.
 */
public class RediffLoginPage {
    WebDriver driver;

    public RediffLoginPage(WebDriver driver){
        this.driver = driver;
    }
    By usernameTextBox = By.xpath("//input[@id='login1']");
    By passwordTextBox = By.id("password");
    By signInButton = By.name("proceed");
    By homeLink = By.linkText("rediff.com");

    public WebElement email(){
      return driver.findElement(usernameTextBox);
    }

    public WebElement password(){
        return driver.findElement(passwordTextBox);
    }

    public WebElement signIn(){
        return driver.findElement(signInButton);
    }

    public WebElement home(){
        return driver.findElement(homeLink);
    }
}
