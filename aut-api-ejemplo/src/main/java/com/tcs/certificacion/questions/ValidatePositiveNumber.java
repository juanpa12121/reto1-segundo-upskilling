package com.tcs.certificacion.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidatePositiveNumber implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        return SerenityRest.lastResponse().body().jsonPath().get("count");
    }

    public static ValidatePositiveNumber validatePositiveNumber(){
        return new ValidatePositiveNumber();
    }
}
