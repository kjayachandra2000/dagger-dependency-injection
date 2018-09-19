package com.jc.dependency.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private WebDriver driver = null;

    public WebDriver getDriver() {
        if (driver == null) {
            switch (Settings.get("browser").toLowerCase()) {
                case "chrome":
                    driver = getChromeDriver();
                    break;
                default:
                    driver = getChromeDriver();
                    break;
            }
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver;
    }

    private WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("--start-maximized");
        options.addArguments("disable-extensions");
        options.addArguments("--disable-infobars");
        options.setExperimentalOption("useAutomationExtension", false);

        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Nexus 5");
        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        return new ChromeDriver(options);
    }
}
