package com.jc.dependency.tests;

import com.jc.dependency.steps.HomeSteps;
import com.jc.dependency.tests.di.BaseComponent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

public class FlightTest extends BaseTest {

    @Inject
    HomeSteps homeSteps;

    @Override
    void performInjection(BaseComponent baseComponent) {
        baseComponent.inject(this);
    }

    @Test
    void samTest() {
        homeSteps
                .onHomePageCheck();
        Assertions.assertTrue(true);
    }
}
