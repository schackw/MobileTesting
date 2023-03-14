package co.com.bancolombia.mobile.automation.interactions;

import co.com.bancolombia.mobile.automation.utils.Messages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WaitTimeFor implements Interaction {

    private static final Logger LOGGER = Logger.getLogger(Messages.LOGGER_INFO);
    private int ms;

    public WaitTimeFor(int ms) {
        this.ms = ms;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {

            LOGGER.log(Level.WARNING, ex.getMessage());

        }
    }
    public static WaitTimeFor timeIn(int ms){
        return Tasks.instrumented(WaitTimeFor.class,ms);
    }
}
