package starter.stepdefinitions;

import co.com.choucair.tasks.LoginData;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.tasks.FormData;
import co.com.choucair.tasks.Register;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class exitoStepDefinitions {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Daniel Sandoval need open form register in exito app")
    public void Daniel_need_open_form_register_in_exito_app() {
        theActorCalled("Daniel").attemptsTo(
                new Register()
        );
    }
    @When("he opened register window add registration data")
    public void he_opened_register_window_add_registration_data(){
        theActorInTheSpotlight().attemptsTo(
                new FormData()

        );
    }
}
