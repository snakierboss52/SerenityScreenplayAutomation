package WebElements;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

@RunWith(SerenityRunner.class)
public class HandlingDropdowns extends PageObject {

    @Managed(driver = "chrome")
    public WebDriver driver;

    @Test
    public void WebElementTest() throws InterruptedException {
        open();
        //find(By.id("searchLanguage")).selectByVisibleText("Eesti");
        //find(By.id("searchLanguage")).selectByValue("hi");
       List<WebElementFacade> values = findAll(By.tagName("option"));
       System.out.println("Total values in dropdown are" + values);
       values.get(7).getText();
       values.get(7).getAttribute("lang");
        Thread.sleep(3000);
    }
}
