package org.example.testCases;

import org.example.pageObjects.RediffHomePage;
import org.example.pageObjects.RediffHomePagePF;
import org.example.pageObjects.RediffLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Developed by Anand Singh on 03/Jul/2021, 11:45 PM.
 * Copyright (c) 2021. All rights reserved.
 */
public class LoginTest {
    @Test
    public void login(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffLoginPage rl = new RediffLoginPage(driver);
        rl.email().sendKeys("anandSingh@gmail.com");
        rl.password().sendKeys("helloworld");
        rl.home().click();
        //re.signIn().click();
        RediffHomePagePF rh = new RediffHomePagePF(driver);
        rh.search().sendKeys("rediff");
        rh.submit().click();
    }
}
