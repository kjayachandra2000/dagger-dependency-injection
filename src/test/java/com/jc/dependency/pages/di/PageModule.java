package com.jc.dependency.pages.di;

import com.jc.dependency.pages.FlightStatusPage;
import com.jc.dependency.pages.HomePage;
import dagger.Module;
import dagger.Provides;
import org.openqa.selenium.WebDriver;

import javax.inject.Singleton;

@Module
public class PageModule {

    @Singleton
    @Provides
    HomePage provideHomePage(WebDriver driver) {
        return new HomePage(driver);
    }

    @Singleton
    @Provides
    FlightStatusPage provideFlightStatusPage(WebDriver driver) {
        return new FlightStatusPage(driver);
    }
}
