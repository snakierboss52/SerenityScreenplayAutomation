package UserInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage {

    public static Target seleccionarMarca = Target.the("Marca del menu").located(By.id("com.muy.selfmanagement:id/constraint_layout_brand"));

    public static Target SeleccionarPersonalizado = Target.the("Promo muy x3").located(By.id("com.muy.selfmanagement:id/button_add_to_cart"));

}
