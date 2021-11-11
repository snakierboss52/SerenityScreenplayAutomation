package Steps;

import Tasks.CreateOrder;
import Tasks.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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


}
