package com.tcs.certificacion.questions;

import com.tcs.certificacion.models.DataUserGet;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateCountryId implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        DataUserGet dataUserObjectFromApi = SerenityRest.lastResponse().jsonPath().getObject("", DataUserGet.class);
        return dataUserObjectFromApi.getCountry_id();
    }

    public static ValidateCountryId validateCountry(){
        return new ValidateCountryId();
    }
}
