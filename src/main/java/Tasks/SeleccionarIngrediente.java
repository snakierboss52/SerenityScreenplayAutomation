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
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jorge.attemptsTo(Click.on(arrozIntegral),
        Click.on(frijolRojo),
        Click.on(proteinaEspinacaTomate),
        Click.on(proteinaPolloALaPlancha),
        Click.on(botonSiguiente),
        Click.on(acompanamientoPlatano),
        Click.on(acompanamientoPlatano),
        Click.on(acompanamientoTocineta),
        Click.on(acompanamientoChorizo),
        Click.on(botonSiguiente),
        Click.on(salsaHogao),
        Click.on(botonSiguiente),
        Click.on(gaseosaQuatro),
        Click.on(botonSiguiente),
        Click.on(galletaAvenaPasas),
        Click.on(botonSiguiente));

    }

    public static Performable inIngredientes() {
        return Tasks.instrumented(SeleccionarIngrediente.class);
    }

}
