package com.jc.dependency.steps;

import com.jc.dependency.pages.FlightStatusPage;

import javax.inject.Inject;

public class FlightStatusSteps extends BaseSteps {

    private FlightStatusPage flightStatusPage;

    @Inject
    public FlightStatusSteps(FlightStatusPage flightStatusPage) {
        this.flightStatusPage = flightStatusPage;
    }

    public void checkFlightByNumber(String flightNumber) {
        flightStatusPage
                .selectFlightNumber()
                .setFlightNumber(flightNumber)
                .checkFlightStatus();
    }
}
