package com.jc.dependency.tests.di;

import com.jc.dependency.support.DriverManager;
import dagger.Module;
import dagger.Provides;
import org.openqa.selenium.WebDriver;

import javax.inject.Singleton;

@Module
class BaseModule {

    @Singleton
    @Provides
    DriverManager providesDriverManager() {
        return new DriverManager();
    }

    @Singleton
    @Provides
    WebDriver provideWebDriver(DriverManager driverManager) {
        return driverManager.getDriver();
    }
}
