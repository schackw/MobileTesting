package co.com.bancolombia.mobile.automation.questions;

import co.com.bancolombia.mobile.automation.userinterfaces.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AlertLog implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;

        return LogInPage.AlertTextLog.resolveFor(actor).isEnabled();
    }
    public static Question<Boolean> isEnable(){
        return new AlertLog();
    }
}
