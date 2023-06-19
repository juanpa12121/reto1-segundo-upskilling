package com.tcs.certificacion.setup.hook;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class PrepareEscenario {
    @Before
    public void prepararEscenarios() {
        setTheStage(new OnlineCast());
        theActor("Administrador");
    }
}
