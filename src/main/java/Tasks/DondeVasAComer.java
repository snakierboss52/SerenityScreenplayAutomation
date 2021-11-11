package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static UserInterface.DondeVasAComerPage.comerAqui;
import static UserInterface.DondeVasAComerPage.paraLlevar;


public class DondeVasAComer implements Task {

    public String orderMode;

    public DondeVasAComer(String orderMode){
        this.orderMode = orderMode;
    }

    @Override
    public <T extends Actor> void performAs(T jorge) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(orderMode.equals("Para llevar")){
            jorge.attemptsTo(Click.on(paraLlevar));
        }else{
            jorge.attemptsTo(Click.on(comerAqui));
        }

    }

    public static Performable inOrderMode(String orderMode) {
        return Tasks.instrumented(DondeVasAComer.class, orderMode);
    }

}
