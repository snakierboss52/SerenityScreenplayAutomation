package Tasks;

import UserInterface.PersonalizadoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static UserInterface.MenuMuyPage.tamanoMuy;

public class Personalizado implements Task {


    @Override
    public <T extends Actor> void performAs(T jorge) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jorge.attemptsTo(Click.on(tamanoMuy));


    }


    public static Performable inTamanoMuy() {
        return Tasks.instrumented(Personalizado.class);
    }
}
