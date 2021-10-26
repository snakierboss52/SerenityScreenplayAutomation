package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static UserInterface.MenuPage.*;

public class Menu implements Task {

    public String marca;


    @Override
    public <T extends Actor> void performAs(T jorge) {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jorge.attemptsTo(Click.on(SeleccionarPersonalizado));

    }


    public static Performable inMenu(String marca) {
        return Tasks.instrumented(Menu.class, marca);
    }

    public static Performable inPersonalizado() {
        return Tasks.instrumented(Menu.class);
    }




}
