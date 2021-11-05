package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/features/HappyPathMuy.feature",glue = "Steps")
public class Runner{



}
