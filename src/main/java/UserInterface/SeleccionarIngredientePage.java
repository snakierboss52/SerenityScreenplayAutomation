package UserInterface;

import net.serenitybdd.core.annotations.findby.By;

import net.serenitybdd.screenplay.targets.Target;



public class SeleccionarIngredientePage {

    public static Target arrozIntegral = Target.the("Ingrediente base arroz integral").located(By.xpath("//android.widget.TextView[@text='Arroz integral']"));
    public static Target botonSiguiente = Target.the("Boton siguiente").located(By.id("com.muy.selfmanagement:id/button_right_action"));
    public static Target frijolRojo = Target.the("Ingrediente grano frijo rojo").located(By.xpath("//android.widget.TextView[@text='Frijol rojo']"));
    public static Target proteinaEspinacaTomate = Target.the("Espinaca y tomate").located(By.xpath("//android.widget.TextView[@text='Espinaca y tomate']"));
    public static Target proteinaPolloALaPlancha = Target.the("Pollo a a plancha").located(By.xpath("//android.widget.TextView[@text='Pollo a la plancha']"));
    public static Target acompanamientoPlatano = Target.the("Platano maduro").located(By.xpath("//android.widget.TextView[@text='Plátano maduro']"));
    public static Target acompanamientoTocineta = Target.the("Maiz tierno").located(By.xpath("//android.widget.TextView[@text='Tocineta']"));
    public static Target acompanamientoChorizo = Target.the("Maiz tierno").located(By.xpath("//android.widget.TextView[@text='Chorizo']"));
    public static Target salsaHogao = Target.the("Hogao").located(By.xpath("//android.widget.TextView[@text='Hogao']"));
    public static Target gaseosaQuatro = Target.the("Gaseosa Quatro 400 ml").located(By.xpath("//android.widget.TextView[@text='Quatro 400 ml']"));
    public static Target galletaAvenaPasas = Target.the("Galleta de avena con pasas").located(By.xpath("//android.widget.TextView[@text='Galleta avena y pasas']"));

}
