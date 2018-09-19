package com.jc.dependency.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void checkHomePageMethod() {
        System.out.println("in Home Page");
    }
}
