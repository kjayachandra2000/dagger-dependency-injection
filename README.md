# dagger dependency-injection
### Summary
This project uses dagger as dependency injection and to inject the steps in tests and to inject pages in steps.

Philosophy here is: "Keep it simple, stupid".

### Requirements
Java 8, Maven

### Run tests from command line
mvn clean test.

### How to implement
> #### Test Update
> > For each test class update `BaseComponent` class with `void inject(FlightTest flightTest);`

> #### Steps Update
> > For each steps class update `StepsModule` class with
 
    @Singleton
    @Provides
    FlightStatusSteps provideFlightStatusSteps(FlightStatusPage flightStatusPage) {
        return new FlightStatusSteps(flightStatusPage);
    }
  
> #### Page Update
> > For each page class update `PageModule` class with

    @Singleton
    @Provides
    FlightStatusPage provideFlightStatusPage(WebDriver driver) {
        return new FlightStatusPage(driver);
    }
    
    

### More information on Dagger 2
https://google.github.io/dagger/
