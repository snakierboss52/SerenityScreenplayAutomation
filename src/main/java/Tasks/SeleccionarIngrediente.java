package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static UserInterface.SeleccionarIngredientePage.*;


public class SeleccionarIngrediente implements Task {

    @Override
    public <T extends Actor> void performAs(T jorge) {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jorge.attemptsTo(Click.on(arrozIntegral));
        jorge.attemptsTo(Click.on(frijolRojo));
        jorge.attemptsTo(Click.on(proteinaEspinacaTomate));
        jorge.attemptsTo(Click.on(proteinaPolloALaPlancha));
        jorge.attemptsTo(Click.on(botonSiguiente));
    }

    public static Performable inIngrediente() {
        return Tasks.instrumented(SeleccionarIngrediente.class);
    }

}
