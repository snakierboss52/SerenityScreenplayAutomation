package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class EndToEnd1 {

    @Given("^Store employee login into application with (.+) and (.+) and skip the welcome video$")
    public void store_employee_login_into_application_with_and_and_skip_the_welcome_video(String storeemail, String password) throws Throwable {

    }

    @When("^User login into application with (.+)$")
    public void user_login_into_application_with(String numberPhone) throws Throwable {

    }

    @Then("^The user registered and create an order$")
    public void the_user_registered_and_create_an_order() throws Throwable {

    }

    @And("^Complete the form with his (.+) and his (.+)$")
    public void complete_the_form_with_his_and_his(String name, String lastname) throws Throwable {

    }

    @And("^Select his (.+), the (.+), his sugerido with (.+)$")
    public void select_his_the_his_sugerido_with(String ordermode, String brand, String size) throws Throwable {

    }
}
