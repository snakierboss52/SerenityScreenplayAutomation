package Tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static UserInterface.LoginPage.*;

public class Login implements Task {

    public String email;
    public String pass;

    public Login (String email, String pass){
        this.email = email;
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T jorge) {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jorge.attemptsTo(Enter.theValue(email).into(emailStore));
        jorge.attemptsTo(Enter.theValue(pass).into(password));
        jorge.attemptsTo(Click.on(EntrarButton));
        jorge.attemptsTo(Click.on(skipVideo));

    }


    public static Performable inStore(String email, String pass) {
        return Tasks.instrumented(Login.class, email, pass);
    }
}
