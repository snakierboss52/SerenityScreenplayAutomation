package UserInterface;


import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;


public class LoginPage{

    public static Target emailStore = Target.the("Correo de la tienda").located(By.id("com.muy.selfmanagement:id/et_super_auth_email"));
    public static Target password = Target.the("Password de la tienda").located(By.id("com.muy.selfmanagement:id/et_super_auth_password"));
    public static Target EntrarButton = Target.the("Boton de entrar").located(By.id("com.muy.selfmanagement:id/btn_super_auth_login"));
    public static Target skipVideo = Target.the("Saltar video").located(By.id("com.muy.selfmanagement:id/fl_welcome_container"));

}
