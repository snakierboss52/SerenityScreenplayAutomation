package Steps;

import Tasks.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class HappyPath{


        @Given("^Store employee login into application with (.+) and (.+) and skip the welcome video$")
        public void store_employee_login_into_application_with_and_and_skip_the_welcome_video(String storeemail, String password) throws Throwable {

                theActorCalled("Jorge").attemptsTo(Login.inStore(storeemail));

        }

        @When("^User login into application with (.+) and select his (.+), the (.+), his (.+) with (.+)$")
        public void user_login_into_application_with_and_select_his_the_his_with(String numberPhone, String ordermode, String brand, String sugerido, String size) throws Throwable {

                theActorCalled("Jorge").attemptsTo(LoginUser.inApp());
                theActorCalled("Jorge").attemptsTo(DondeVasAComer.paraLlevar());
                theActorCalled("Jorge").attemptsTo(Menu.inPersonalizado());
                theActorCalled("Jorge").attemptsTo(Personalizado.inTamanoMuy());
                Thread.sleep(5000);

        }

        @Then("^User create the order$")
        public void user_create_the_order() throws Throwable {

        }

    }
