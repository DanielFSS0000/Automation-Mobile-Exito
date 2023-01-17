package co.com.choucair.tasks;

import co.com.choucair.userinterface.LoginView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.choucair.userinterface.FormRegisterView;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FormData implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FormRegisterView.name,isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                SendKeys.of("daniel").into(FormRegisterView.name),
                SendKeys.of("sandoval").into(FormRegisterView.lastname),
                SendKeys.of("1075305026").into(FormRegisterView.cedula),
                WaitUntil.the(FormRegisterView.year,isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                SendKeys.of("1997").into(FormRegisterView.year),
                SendKeys.of("06").into(FormRegisterView.month),
                SendKeys.of("20").into(FormRegisterView.day),
                SendKeys.of("3142800015").into(FormRegisterView.cell),
                SendKeys.of("daniel970620@gmail.com").into(FormRegisterView.mail),
                //SetCheckbox.of(FormRegisterView.check_one).toTrue(),
                //WaitUntil.the(FormRegisterView.check_one,isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                //SetCheckbox.of(FormRegisterView.check_two).toTrue(),
               // WaitUntil.the(FormRegisterView.check_two,isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(FormRegisterView.login),
                WaitUntil.the(FormRegisterView.accept_btn,isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(FormRegisterView.accept_btn),
                SendKeys.of("daniel970620@gmail.com").into(FormRegisterView.input_mail),
                SendKeys.of("Dcm7lkoss3.").into(FormRegisterView.input_password),
                Click.on(FormRegisterView.login_btn),
                Click.on(FormRegisterView.location)
               /* WaitUntil.the(FormRegisterView.search_product,isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(FormRegisterView.search_product),
                Click.on(FormRegisterView.img_exito),
                Click.on(FormRegisterView.select_city),
                Click.on(FormRegisterView.opc_neiva),
                Click.on(FormRegisterView.selec_sede),
                SendKeys.of("Exito San Pedro Neiva").into(FormRegisterView.opc_sede),
                Click.on(FormRegisterView.btn_continuar),
                WaitUntil.the(FormRegisterView.btn_continuar,isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(FormRegisterView.btn_continuar),
                SendKeys.of("iphone").into(FormRegisterView.edit_search).thenHit(Keys.ENTER),
                WaitUntil.the(FormRegisterView.add_product,isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(FormRegisterView.add_product),
                Click.on(FormRegisterView.view_cart)*/
        );


    }
}
