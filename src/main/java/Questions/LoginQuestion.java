package Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static UserInterface.LoginPage.emailStore;

public class LoginQuestion implements Question<String>{

    Actor Jorge;
    public static boolean isDisplayed;

    @Override
    public String answeredBy(Actor Jorge) {
        return null;
    }

    //questions ambigua si no esta presente se revienta el test
    public static Question<String> loginQuestion() {
        return Jorge -> emailStore.resolveFor(Jorge).waitUntilClickable();
    }


    @Override
    public String getSubject() {

        return Question.super.getSubject();
    }
}
