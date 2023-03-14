package co.com.bancolombia.mobile.automation.tasks;

import co.com.bancolombia.mobile.automation.userinterfaces.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

public class FillLogWith implements Task {

    private  String username ;
    private  String password ;

    public FillLogWith(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(username).into(LogInPage.UserNameLabelText),
                Enter.theValue(password).into(LogInPage.PasswordLabelText)
        );
    }
    public static FillLogWith theCredeentials(String username,String password){
        return Tasks.instrumented(FillLogWith.class,username,password);
    }
}
