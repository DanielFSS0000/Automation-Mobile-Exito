package co.com.choucair.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterView {
    public static Target btn_register = Target.the("button register")
            .located(By.id("com.exito.appcompania:id/AppCompatButton_registrarse"));
}
