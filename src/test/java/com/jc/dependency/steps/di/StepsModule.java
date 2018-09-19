package com.jc.dependency.steps.di;

import com.jc.dependency.pages.FlightStatusPage;
import com.jc.dependency.pages.HomePage;
import com.jc.dependency.steps.FlightStatusSteps;
import com.jc.dependency.steps.HomeSteps;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class StepsModule {

    @Singleton
    @Provides
    HomeSteps provideHomeSteps(HomePage homePage) {
        return new HomeSteps(homePage);
    }

    @Singleton
    @Provides
    FlightStatusSteps provideFlightStatusSteps(FlightStatusPage flightStatusPage) {
        return new FlightStatusSteps(flightStatusPage);
    }
}
