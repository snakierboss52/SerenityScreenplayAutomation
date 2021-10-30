package Questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static UserInterface.LoginPage.emailStore;

public class LoginQuestion implements Question<String>{

    Actor Jorge;
    public static boolean isDisplayed;

    @Override
    public String answeredBy(Actor Jorge) {
        return null;
    }

    public static Question<String> loginQuestion() {
        return Jorge -> Text.of(emailStore).viewedBy(Jorge).asString();
    }


    @Override
    public String getSubject() {

        return Question.super.getSubject();
    }
}
