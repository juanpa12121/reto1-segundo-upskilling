package com.tcs.certificacion.stepdefinitions;

import com.tcs.certificacion.questions.*;
import com.tcs.certificacion.tasks.GetGender;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetGenderByNameStepDefinitions {
    @Given("I can query the genderize api")
    public void iCanQueryTheGenderizeApi() {
        theActorInTheSpotlight().whoCan(CallAnApi.at("https://api.genderize.io"));
    }

    @When("I query the genderize api with name {string}")
    public void iQueryTheGenderizeApiWithNameJohn(String name) {
        theActorInTheSpotlight().attemptsTo(GetGender.withName(name));
    }

    @Then("I get a response with status code {int}")
    public void iGetAResponseWithStatusCode(int statusCode) {
        theActorInTheSpotlight().should(seeThat(ValidateStatus.code(), Matchers.equalTo(statusCode)));
    }

    @Then("Gender response only returns male or female")
    public void genderResponseOnyReturnsAnd() {
        theActorInTheSpotlight().should(seeThat(ValidateGender.validateGender()));
    }

    @Then("Name response returns the name {string} given to the service")
    public void nameResponseReturnsTheNameGivenToTheService(String name) {
        theActorInTheSpotlight().should(seeThat(ValidateName.validateName(), Matchers.equalTo(name)));
    }

    @Then("Probability response returns a percentage between 0 and 1")
    public void probabilityResponseReturnsAPercentageBetweenAnd() {
        theActorInTheSpotlight().should(seeThat(ValidatePercentage.validatePercentage()));
    }

    @Then("Count response returns a positive number")
    public void countResponseReturnsAPositiveNumber() {
        theActorInTheSpotlight().should(seeThat(ValidatePositiveNumber.validatePositiveNumber(), Matchers.greaterThan(0)));
    }

}
