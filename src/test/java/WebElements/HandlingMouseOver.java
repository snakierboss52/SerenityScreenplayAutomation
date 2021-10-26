package WebElements;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HandlingMouseOver extends PageObject {

    @Managed()
    public WebDriver driver;

    @Test
    public void mouseOver(){
        open();
        withAction().moveToElement($("//*[@id=\"navbar-collapse-1\"]/ul/li[3]/a")).perform();
        $("//*[@id=\"navbar-collapse-1\"]/ul/li[3]/a").click();
    }

}
