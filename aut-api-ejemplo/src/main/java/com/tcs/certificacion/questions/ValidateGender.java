package com.tcs.certificacion.questions;

import com.tcs.certificacion.models.DataUserGet;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateGender implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        DataUserGet dataUserObjectFromApi = SerenityRest.lastResponse().jsonPath().getObject("", DataUserGet.class);
        return (dataUserObjectFromApi.getGender().equals("male") ||
                dataUserObjectFromApi.getGender().equals("female")
        );
    }

    public static ValidateGender validateGender( ){
        return new ValidateGender();
    }
}
