package co.com.bancolombia.mobile.automation.tasks;

import co.com.bancolombia.mobile.automation.userinterfaces.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickOn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LogInPage.LoginBoton));
    }
    public static ClickOn element(){
        return Tasks.instrumented(ClickOn.class);
    }
}
