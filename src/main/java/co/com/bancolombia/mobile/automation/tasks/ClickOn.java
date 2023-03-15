package co.com.bancolombia.mobile.automation.tasks;

import co.com.bancolombia.mobile.automation.userinterfaces.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOn implements Task {
    private Target option;

    public ClickOn(Target option) {
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(option));
    }

    public static ClickOn element(Target option) {
        return Tasks.instrumented(ClickOn.class, option);
    }
}
