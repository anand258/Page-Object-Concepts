package org.example.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Developed by Anand Singh on 04/Jul/2021, 12:09 AM.
 * Copyright (c) 2021. All rights reserved.
 */
public class RediffHomePage {
    WebDriver driver;

    public RediffHomePage(WebDriver driver){
        this.driver = driver;
    }

    By searchTextBox = By.id("srchword");
    By searchButton = By.xpath("//input[@aria-label='Search']");

    public WebElement search(){
        return driver.findElement(searchTextBox);
    }

    public WebElement submit(){
        return driver.findElement(searchButton);
    }
}
