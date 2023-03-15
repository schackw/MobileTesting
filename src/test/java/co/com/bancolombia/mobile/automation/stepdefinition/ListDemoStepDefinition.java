package co.com.bancolombia.mobile.automation.stepdefinition;

import co.com.bancolombia.mobile.automation.tasks.ClickOn;
import co.com.bancolombia.mobile.automation.userinterfaces.ListDemoPage;
import co.com.bancolombia.mobile.automation.userinterfaces.LogInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ListDemoStepDefinition {


    @Given("The user need be in the list section")
    public void theUserNeedBeInTheListSection() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOn.element(ListDemoPage.ListDemoBlock));
    }
    @When("The user look for a {string} in the list")
    public void theUserLookForAInTheList(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("The user will check the cloud that he look before")
    public void theUserWillCheckTheCloudThatHeLookBefore() {
        // Write code here that turns the phrase above into concrete actions

    }

}
