package UserInterface;

import net.serenitybdd.screenplay.targets.Target;

import net.serenitybdd.core.annotations.findby.By;

public class LoginUserPage {

    public static Target userNumberPhone = Target.the("Numero De Telefono").located(By.id("com.muy.selfmanagement:id/et_login_phone"));
    public static Target buttonContinuar = Target.the("Boton continuar").located(By.id("com.muy.selfmanagement:id/btn_login"));
}
