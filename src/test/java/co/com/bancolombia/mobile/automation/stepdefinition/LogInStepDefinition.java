package co.com.bancolombia.mobile.automation.stepdefinition;

import co.com.bancolombia.mobile.automation.interactions.WaitTimeFor;
import co.com.bancolombia.mobile.automation.tasks.ClickOn;
import co.com.bancolombia.mobile.automation.tasks.FillLogWith;
import co.com.bancolombia.mobile.automation.tasks.NavigateTo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LogInStepDefinition {
    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User page");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Given("I want to log in")
    public void iWantToLogIn() {

        OnStage.theActorInTheSpotlight().attemptsTo(NavigateTo.LogIn());
    }

    @When("I enter incorrect credentials")
    public void iEnterIncorrectCredentials() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(FillLogWith.theCredeentials("usuario", "contra"));
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOn.element());
    }

    @Then("I will see that i cant log in")
    public void iWillSeeThatICantLogIn() {
        // Write code here that turns the phrase above into concrete actions

    }

}
