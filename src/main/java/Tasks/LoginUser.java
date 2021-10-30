package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static UserInterface.LoginUserPage.buttonContinuar;
import static UserInterface.LoginUserPage.userNumberPhone;

public class LoginUser implements Task {

     public String numberPhone;

     public LoginUser(String numberPhone){
         this.numberPhone = numberPhone;
     }

    @Override
    public <T extends Actor> void performAs(T jorge) {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jorge.attemptsTo(Enter.theValue(numberPhone).into(userNumberPhone));
        jorge.attemptsTo(Click.on(buttonContinuar));
    }

    public static LoginUser inApp(String numberPhone) {
        return Tasks.instrumented(LoginUser.class, numberPhone);
    }
}
