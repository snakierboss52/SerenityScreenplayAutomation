package WebElements;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webelements.Checkbox;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;


@RunWith(SerenityRunner.class)
public class HandlingCheckBoxes extends PageObject {

    @Managed(driver = "chrome")
    public WebDriver driver;

    @Test
    public void checkBoxTest() throws InterruptedException {
        open();

        Checkbox checkbox = new Checkbox($("//xpatcheckbox"));
        checkbox.isChecked();
        checkbox.setChecked(true);

        WebElementFacade block = find(By.xpath("xpahtcomundelosbloquescheckbox"));
        List<WebElementFacade> checkboxes = block.thenFindAll(By.tagName("tagdelcheckboxdentrodelbloque"));
        checkboxes.get(1).click();

        Thread.sleep(3000);
    }



}
