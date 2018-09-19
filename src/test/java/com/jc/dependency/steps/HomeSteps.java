package com.jc.dependency.steps;

import com.jc.dependency.pages.HomePage;

import javax.inject.Inject;

public class HomeSteps extends BaseSteps {

    private HomePage homePage;

    @Inject
    public HomeSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    public void openFlightStatus() {
        homePage
                .openFlightStatus();
    }
}
