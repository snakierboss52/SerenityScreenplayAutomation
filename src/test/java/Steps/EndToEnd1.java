package Steps;

import Questions.GetIdOrderQuestion;
import Tasks.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.apache.commons.collections4.Get;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class EndToEnd1 {
    public static String emailStore = "muy83-ag1@muy.com.co";
    public static String password = "muy83-ag";

    @Dado("^El empleado de robinfood se loguee con las credenciales en Autogestion$")
    public void elEmpleadoDeRobinfoodSeLogueeConLasCredencialesEnAutogestion() {

        theActorInTheSpotlight().attemptsTo(Login.inStore(emailStore,password));
    }

    @Cuando("^El usuario se loguee con su (.*) seleccione su plato y finalice la orden$")
    public void elUsuarioSeLogueeConSuNumeroTelefonoSeleccioneSuPlatoYFinaliceLaOrden(String numeroTelefono) {

        theActorInTheSpotlight().attemptsTo(CreateOrder.finalizarOrden(numeroTelefono));
    }

    @Entonces("^El usuario creo la orden correctamente$")
    public void elUsuarioCreoLaOrdenCorrectamente() {
        //System.out.println(GetIdOrderQuestion.getIdOrderQuestion());
    }
}
