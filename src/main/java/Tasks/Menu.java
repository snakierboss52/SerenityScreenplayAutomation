package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;


import java.time.Duration;

import static UserInterface.MenuMuyPage.*;

public class Menu implements Task {

    public String marca;


    @Override
    public <T extends Actor> void performAs(T jorge) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Diferentes task para cada plato
        jorge.attemptsTo(Ensure.that(SeleccionarPersonalizado.waitingForNoMoreThan(Duration.ofSeconds(5))).isDisplayed());
        jorge.attemptsTo(Click.on(SeleccionarPersonalizado));


    }



    public static Performable inMenu(String marca) {
        return Tasks.instrumented(Menu.class, marca);
    }

    public static Performable inPersonalizado() {
        return Tasks.instrumented(Menu.class);
    }





}
