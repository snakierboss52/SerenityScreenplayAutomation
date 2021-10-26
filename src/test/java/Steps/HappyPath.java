package Steps;

import Tasks.DondeVasAComer;
import Tasks.Login;
import Tasks.LoginUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HappyPath{

        Actor jorge;

        @Given("^Store employee login into application with (.+) and (.+) and skip the welcome video$")
        public void store_employee_login_into_application_with_and_and_skip_the_welcome_video(String storeemail, String password) throws Throwable {

                theActorCalled("Jorge").attemptsTo(Login.inStore(storeemail));

        }

        @When("^User login into application with (.+) and select his (.+), the (.+), his (.+) with (.+)$")
        public void user_login_into_application_with_and_select_his_the_his_with(String numberPhone, String ordermode, String brand, String sugerido, String size) throws Throwable {

                theActorCalled("Jorge").attemptsTo(LoginUser.inApp());
                theActorCalled("Jorge").attemptsTo(DondeVasAComer.paraLlevar());
                Thread.sleep(5000);

        }

        @Then("^User create the order$")
        public void user_create_the_order() throws Throwable {

        }

    }
