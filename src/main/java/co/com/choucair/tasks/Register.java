package co.com.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.choucair.userinterface.RegisterView;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Register implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(RegisterView.btn_register,isVisible()).forNoMoreThan(Duration.ofSeconds(30)),
                Click.on(RegisterView.btn_register)
        );
    }
}
