package UserInterface;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage{

    public static Target emailStore = Target.the("Correo de la tienda").located(By.id("com.muy.selfmanagement:id/et_super_auth_email"));
    public static Target EntrarButton = Target.the("Boton de entrar").located(By.id("com.muy.selfmanagement:id/btn_super_auth_login"));
    public static Target skipVideo = Target.the("Saltar video").located(By.id("com.muy.selfmanagement:id/fl_welcome_container"));

}
