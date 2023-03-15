package co.com.bancolombia.mobile.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/list_demo.feature",
        glue ="co.com.bancolombia.mobile.automation.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class ListDemo {
}
