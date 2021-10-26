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
public class Handlinglinks extends PageObject {

    @Managed(driver = "chrome")
    public WebDriver driver;

    @Test
    public void WebElementTest() throws InterruptedException {
        open();
        //find(By.id("searchLanguage")).selectByVisibleText("Eesti");
        //find(By.id("searchLanguage")).selectByValue("hi");
        List<WebElementFacade> links = findAll(By.tagName("a"));
        System.out.println("Total values in dropdown are" + links);
        //links.get(7).getText();
        //links.get(7).getAttribute("lang");
        Thread.sleep(3000);
    }

}
