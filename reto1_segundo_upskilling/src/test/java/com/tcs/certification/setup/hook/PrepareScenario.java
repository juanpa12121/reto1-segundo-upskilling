package com.tcs.certification.setup.hook;

import com.tcs.certification.enums.Constants;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;


import static com.tcs.certification.enums.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class PrepareScenario {

    private EnvironmentVariables environmentVariables;
    private String ambient;
    @Before
    public void prepareScenario(){
        ambient = environmentVariables.optionalProperty("amb").orElse("https://api.genderize.io/");

        OnStage.setTheStage(new OnlineCast());
        theActor(String.valueOf(ACTOR_NAME.getConstant()));
        //Para @createv2
        String baseUrl = "https://api.genderize.io/";
        OnStage.theActorInTheSpotlight().whoCan(CallAnApi.at(baseUrl));
    }
}
