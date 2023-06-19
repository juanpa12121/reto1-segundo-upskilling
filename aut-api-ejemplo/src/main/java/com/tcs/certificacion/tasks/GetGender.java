package com.tcs.certificacion.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetGender implements Task {

    private final String name;

    public GetGender(String name) {
        this.name = name;
    }

    public static GetGender withName(String name) {
        return Tasks.instrumented(GetGender.class, name);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource("/?name=" + name)
                .with(req -> req
                        .header("Content-Type", "application/json; charset=utf-8")
                        .relaxedHTTPSValidation()
                ));
        SerenityRest.lastResponse().prettyPrint();
    }
}
