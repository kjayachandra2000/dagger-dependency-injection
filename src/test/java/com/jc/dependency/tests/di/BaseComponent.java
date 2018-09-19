package com.jc.dependency.tests.di;

import com.jc.dependency.pages.di.PageModule;
import com.jc.dependency.steps.di.StepsModule;
import com.jc.dependency.tests.BaseTest;
import com.jc.dependency.tests.FlightTest;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {BaseModule.class, StepsModule.class, PageModule.class})
public interface BaseComponent {

    void inject(BaseTest baseTest);

    void inject(FlightTest flightTest);
}
