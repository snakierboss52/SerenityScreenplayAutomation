package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.time.Duration;

import static UserInterface.CheckoutPage.ContinuarACaja;


public class CreateOrder implements Task {

    private String numberPhone = "3005302178";
    private String orderMode = "Para llevar";

    @Override
    public <T extends Actor> void performAs(T jorge) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jorge.attemptsTo(LoginUser.inApp(numberPhone),
        DondeVasAComer.inOrderMode(orderMode),
        Menu.inPersonalizado(),
        Personalizado.inTamanoMuy(),
        SeleccionarIngrediente.inIngredientes(),
        Ruleta.jugarRuleta(),
        Checkout.inFinalizarOrden());
        jorge.attemptsTo(Ensure.that(ContinuarACaja.waitingForNoMoreThan(Duration.ofSeconds(5))).silently().isEnabled());
    }

    public static Performable finalizarOrden(String numberPhone) {
        return Tasks.instrumented(CreateOrder.class);
    }

}
