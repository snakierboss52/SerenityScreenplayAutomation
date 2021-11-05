package UserInterface;


import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class RegisterPage {

    public static Target userName = Target.the("Nombre del usuario").located(By.id("com.muy.selfmanagement:id/et_register_first_name"));
    public static Target userLastName = Target.the("Apellido del usuario").located(By.id("com.muy.selfmanagement:id/et_register_last_name"));
    public static Target checkTerms = Target.the("Checkbox terminos y condiciones").located(By.id("com.muy.selfmanagement:id/cb_terms_and_conditions_register"));
    public static Target registerButton = Target.the("Boton de continuar el registro").located(By.id("com.muy.selfmanagement:id/button_register"));


}
