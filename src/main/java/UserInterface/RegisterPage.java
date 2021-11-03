package UserInterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {

    public static Target userName = Target.the("Nombre del usuario").located(By.id("com.muy.selfmanagement:id/et_register_first_name"));
    public static Target userLastName = Target.the("Apellido del usuario").located(By.id("com.muy.selfmanagement:id/et_register_last_name"));


}
