package org.example.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Developed by Anand Singh on 04/Jul/2021, 12:09 AM.
 * Copyright (c) 2021. All rights reserved.
 */
public class RediffHomePagePF {
    WebDriver driver;

    public RediffHomePagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "srchword")
    WebElement searchTextBox;

    @FindBy(xpath = "//input[@aria-label='Search']")
    WebElement searchButton;

    public WebElement search() {
        return searchTextBox;
    }

    public WebElement submit() {
        return searchButton;
    }
}
