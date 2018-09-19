package com.jc.dependency.tests;

import com.jc.dependency.steps.FlightStatusSteps;
import com.jc.dependency.steps.HomeSteps;
import com.jc.dependency.tests.di.BaseComponent;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

public class FlightTest extends BaseTest {

    @Inject
    HomeSteps homeSteps;

    @Inject
    FlightStatusSteps flightStatusSteps;

    @Override
    void performInjection(BaseComponent baseComponent) {
        baseComponent.inject(this);
    }

    @Test
    void samTest() {
        homeSteps
                .openFlightStatus();
        flightStatusSteps
                .checkFlightByNumber("203");
    }
}
