package com.jc.dependency.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "li[class*='tab-flight-status']")
    private WebElement lnkFlightStatus;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openFlightStatus() {
        lnkFlightStatus.click();
    }
}
