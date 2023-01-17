package co.com.choucair.tasks;

import co.com.choucair.userinterface.LoginView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginData implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        );
    }
}
