package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static UserInterface.RegisterPage.userName;
import static UserInterface.RegisterPage.userLastName;
import static UserInterface.RegisterPage.checkTerms;
import static UserInterface.RegisterPage.registerButton;

public class Register implements Task {

    public String name;
    public String lastName;

    public Register(String name,String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public <T extends Actor> void performAs(T jorge) {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jorge.attemptsTo(Enter.keyValues(name).into(userName));
        jorge.attemptsTo(Enter.keyValues(lastName).into(userLastName));
        jorge.attemptsTo(Click.on(checkTerms));
        jorge.attemptsTo(Click.on(registerButton));
    }

    public static Register inAppWith(String name, String lastName) {
        return Tasks.instrumented(Register.class, name, lastName);
    }


}
