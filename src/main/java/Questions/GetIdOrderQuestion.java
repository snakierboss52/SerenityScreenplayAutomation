package Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static UserInterface.CheckoutPage.ContinuarACaja;
import static UserInterface.LoginPage.emailStore;

public class GetIdOrderQuestion implements Question<String> {

    Actor Jorge;

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }

    public static Question<String> getIdOrderQuestion() {
        return Jorge -> Text.of(ContinuarACaja).viewedBy(Jorge).asString();
    }

}
