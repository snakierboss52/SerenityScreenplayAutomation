package UserInterface;

import net.serenitybdd.core.annotations.findby.By;

import net.serenitybdd.screenplay.targets.Target;



public class SeleccionarIngredientePage {

    public static Target arrozIntegral = Target.the("Ingrediente base arroz integral").located(By.xpath("//android.widget.TextView[@text='Arroz integral']"));
    public static Target botonSiguiente = Target.the("Boton siguiente").located(By.id("com.muy.selfmanagement:id/button_right_action"));
    public static Target frijolRojo = Target.the("Ingrediente grano frijo rojo").located(By.xpath("//android.widget.TextView[@text='Frijol rojo']"));
    public static Target proteinaEspinacaTomate = Target.the("Espinaca y tomate").located(By.xpath("//android.widget.TextView[@text='Espinaca y tomate']"));
    public static Target proteinaPolloALaPlancha = Target.the("Pollo a a plancha").located(By.xpath("//android.widget.TextView[@text='Pollo a la plancha']"));
}
