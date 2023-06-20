package com.tcs.certificacion.stepdefinitions;
import com.tcs.certificacion.questions.ValidateCountryId;
import com.tcs.certificacion.tasks.GetByNameCountry;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetByNameCountryStepDefinitions {

    @When("I query the genderize api with name {string} and country {string}")
    public void iCreateTheRequestWithNameAndCountry(String name, String country) {
        theActorInTheSpotlight().attemptsTo(GetByNameCountry.with(name, country));
    }

    @Then("Country response returns the country {string} given to the service")
    public void nameResponseReturnsTheNameGivenToTheService(String country_id ) {
        theActorInTheSpotlight().should(seeThat(ValidateCountryId.validateCountry(), Matchers.equalTo(country_id)));
    }
}
