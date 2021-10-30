package Steps;

import cucumber.api.java.Before;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.AfterClass;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import static Utils.DriverUtil.setDriver;

public class Hook{



    public static AndroidDriver<MobileElement> driver;


    @Before
    public void init() throws InterruptedException {
        setTheStage(new OnlineCast());
        theActor("Jorge");
        driver = getProxiedDriver();
        setDriver(driver);

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }


}
