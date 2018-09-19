package com.jc.dependency.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, true);
    }
}
