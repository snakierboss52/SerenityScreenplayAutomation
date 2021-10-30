package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static UserInterface.RuletaPage.jugarDespues;


public class Ruleta implements Task {

    @Override
    public <T extends Actor> void performAs(T jorge) {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jorge.attemptsTo(Click.on(jugarDespues));
    }

    public static Performable jugarRuleta() {
        return Tasks.instrumented(Login.class);
    }
}
