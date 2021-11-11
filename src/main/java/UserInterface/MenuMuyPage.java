package UserInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class MenuMuyPage {

    public static Target seleccionarMarca = Target.the("Marca del menu").located(By.id("com.muy.selfmanagement:id/constraint_layout_brand"));

    public static Target SeleccionarPersonalizado = Target.the("Selecciona el plato personalizado").located(By.id("com.muy.selfmanagement:id/button_add_to_cart"));
    public static Target sugeridoFresco = Target.the("Seleccionar Muy sugerido Fresco").located(org.openqa.selenium.By.xpath("//android.widget.TextView[@text='Fresco']"));
    public static Target tamanoMuy = Target.the("Seleccionar tamaño").located(By.id("com.muy.selfmanagement:id/text_view_size_name_and_price"));


}
