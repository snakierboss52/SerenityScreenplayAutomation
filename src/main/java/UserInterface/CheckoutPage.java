package UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

    public static Target finalizarOrden = Target.the("Boton de finalizar orden").located(By.id("com.muy.selfmanagement:id/btn_next"));
    public static Target ContinuarACaja = Target.the("Continuar a caja orden nª").located(By.id("com.muy.selfmanagement:id/text_view_order_number_finish_order"));

}
