package com.jc.dependency.tests;

import com.jc.dependency.support.Settings;
import com.jc.dependency.tests.di.BaseComponent;
import com.jc.dependency.tests.di.DaggerBaseComponent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import javax.inject.Inject;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    @Inject
    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        BaseComponent baseComponent = DaggerBaseComponent.create();
        baseComponent.inject(this);
        performInjection(baseComponent);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get(Settings.get("url"));
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    abstract void performInjection(BaseComponent baseComponent);
}
