package UserInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SugeridoPage {


    public static Target sugeridoFresco = Target.the("Seleccionar Muy sugerido Fresco").located(By.xpath("//android.widget.TextView[@text='Fresco']"));

}
