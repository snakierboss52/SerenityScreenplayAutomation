package UserInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarIngredientePage {

    public static Target arrozIntegral = Target.the("Ingrediente base arroz integral").located(By.xpath("//android.widget.CheckBox[@index='1']"));
    public static Target botonSiguiente = Target.the("Boton siguiente").located(By.id("com.muy.selfmanagement:id/button_right_action"));


}
