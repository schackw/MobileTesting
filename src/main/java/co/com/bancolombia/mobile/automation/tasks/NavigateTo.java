package co.com.bancolombia.mobile.automation.tasks;

import co.com.bancolombia.mobile.automation.userinterfaces.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class NavigateTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LogInPage.LogInLabelText));
    }
    public static NavigateTo LogIn() {return Tasks.instrumented(NavigateTo.class);}
}
