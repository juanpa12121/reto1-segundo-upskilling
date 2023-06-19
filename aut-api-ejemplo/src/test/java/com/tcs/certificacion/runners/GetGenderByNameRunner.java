package com.tcs.certificacion.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"com.tcs.certificacion.stepdefinitions", "com.tcs.certificacion.setup.hook"},
        features = "src/test/resources/com/tcs/certificacion/features/get_gender_by_name.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        strict = true
)
public class GetGenderByNameRunner {
}
