package com.tcs.certificacion.tasks;

import com.tcs.certificacion.models.DataUserPost;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetByNameCountry implements Task {

    private String name;
    private String country_id;

    public GetByNameCountry(String name, String country_id) {
        this.name = name;
        this.country_id = country_id;
    }

    public static GetByNameCountry with(String name, String country_id) {
        return Tasks.instrumented(GetByNameCountry.class, name, country_id);
    }
    //THIS IS THE API CONSUMPTION
    //https://api.genderize.io/?name=John&country=US
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/?name=" + name + "&country_id=" + country_id)
                        .with(rq -> rq
                                .header("Content-Type", "application/json; charset=utf-8")
                                .relaxedHTTPSValidation()
                                //.body(dataUserPost)
                        )

        );

        SerenityRest.lastResponse().prettyPrint();
        SerenityRest.lastResponse().body();
    }


}
