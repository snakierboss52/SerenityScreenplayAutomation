package Steps;

import Tasks.*;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class HappyPath{


        @Given("^Store employee login into application with (.+) and (.+) and skip the welcome video$")
        public void storeEmployeeLoginIntoApplicationWithAndAndSkipTheWelcomeVideo(String storeemail, String password) throws Throwable {

                theActorInTheSpotlight().attemptsTo(Login.inStore(storeemail,password));

        }

        @When("^User login into application with (.+) and select his (.+), the (.+), his (.+) with (.+)$")
        public void userLoginIntoApplicationWithAndSelectHisTheHisWith(String numberPhone, String orderMode, String brand, String sugerido, String size) throws Throwable {

                //refactorizar los .feature para no pasarle tantos parametros y hacelos mas faciles de leer y parafrasear
                theActorInTheSpotlight().attemptsTo(CreateOrder.finalizarOrden(numberPhone, orderMode));
                Thread.sleep(3000);
        }



        @Then("^User create the order$")
        public void userCreateTheOrder() throws Throwable {
                //CAPTURAR EL ID DE LA ORDEN
        }
        @When("^User login into application with his (.+)$")
        public void user_login_into_application_with(String numberPhone) throws Throwable {

                theActorCalled("Jorge").attemptsTo(LoginUser.inApp(numberPhone));

        }

        @Then("^The user registered and create an order$")
        public void the_user_registered_and_create_an_order() throws Throwable {

        }

        @And("^Complete the form with his (.+) and his (.+)$")
        public void complete_the_form_with_his_and_his(String name, String lastName) throws Throwable {

                theActorCalled("Jorge").attemptsTo(Register.inAppWith(name,lastName));
                Thread.sleep(5000);

        }

        @And("^Select his (.+), the (.+), his (.+) with (.+)$")
        public void select_his_the_his_sugerido_with(String orderMode, String brand, String sugerido ,String size) throws Throwable {
                //Implementar funcionde scroll con el sugerido y hacer click then  crear la orden
                theActorCalled("Jorge").attemptsTo(DondeVasAComer.inOrderMode(orderMode));



        }


}
