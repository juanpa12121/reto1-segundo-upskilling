package com.tcs.certificacion.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidatePercentage implements Question<Boolean> {

    //Validar que la respuesta tenga en el campo porcentaje, un numero entre 0 hy 1
    @Override
    public Boolean answeredBy(Actor actor) {
        return (SerenityRest.lastResponse().jsonPath().getDouble("probability") >= 0 &&
                SerenityRest.lastResponse().jsonPath().getDouble("probability") <= 1);

    }

    public static ValidatePercentage validatePercentage(){
        return new ValidatePercentage();
    }
}
