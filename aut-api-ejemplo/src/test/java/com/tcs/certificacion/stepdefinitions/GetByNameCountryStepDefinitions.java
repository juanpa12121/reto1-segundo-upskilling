package com.tcs.certificacion.stepdefinitions;

import com.tcs.certificacion.tasks.GetByNameCountry;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetByNameCountryStepDefinitions {

    @When("I query the genderize api with name {string} and country {string}")
    public void iCreateTheRequestWithNameAndCountry(String name, String country) {
        theActorInTheSpotlight().attemptsTo(GetByNameCountry.with(name, country));
    }
}
