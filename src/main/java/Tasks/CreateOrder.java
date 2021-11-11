package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


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
    }

    public static Performable finalizarOrden(String numberPhone, String orderMode) {
        return Tasks.instrumented(CreateOrder.class);
    }

}
